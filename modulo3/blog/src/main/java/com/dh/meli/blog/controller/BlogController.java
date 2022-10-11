package com.dh.meli.blog.controller;

import com.dh.meli.blog.entity.Blog;
import com.dh.meli.blog.exception.NotFoundException;
import com.dh.meli.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BlogController {
    @Autowired
    private BlogService blogService;

//    1. Criar uma nova entrada de Blog e retornar uma mensagem apropriada dizendo que
//    foi criado com sucesso mostrando seu “Id”. (URI: /blog).
//    Caso já exista uma entrada de blog com esse "Id", capture a exceção e retorne uma
//    mensagem indicando tal situação.

    @PostMapping(path = "/blog")
    public ResponseEntity<Blog> addBlog(@RequestBody Blog blog) {
        blogService.addBlog(blog);
        return ResponseEntity.ok(blog);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable Long id) throws NotFoundException {
        Blog response = blogService.getBlogById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlogs() {
        return new ResponseEntity<>(blogService.getAll(), HttpStatus.OK);
    }
}
