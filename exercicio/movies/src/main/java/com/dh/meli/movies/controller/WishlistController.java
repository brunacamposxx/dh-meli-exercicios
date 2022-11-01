package com.dh.meli.movies.controller;

import com.dh.meli.movies.domain.dto.AuthenticatedUserDetails;
import com.dh.meli.movies.domain.dto.WishlistItemRequest;
import com.dh.meli.movies.service.WishlistService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/wishlist")
@RolesAllowed("NORMAL_USER")
public class WishlistController {

    private final WishlistService wishlistService;

    public WishlistController(WishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping
    public List<String> getWishlist(@AuthenticationPrincipal AuthenticatedUserDetails authenticatedUser){
        return this.wishlistService.getWishlistByUser(authenticatedUser.id());
    }
    @PostMapping
    public void addWishlistItem(@RequestBody @Valid WishlistItemRequest wishlistItemRequest){
        this.wishlistService.save(wishlistItemRequest.description(), 1l);
    }
}