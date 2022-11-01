package com.dh.meli.movies.service;

import com.dh.meli.movies.domain.dto.GetUsersResponse;
import com.dh.meli.movies.domain.dto.UserCreateRequest;
import com.dh.meli.movies.domain.dto.UserCreateResponse;
import com.dh.meli.movies.domain.entity.User;
import com.dh.meli.movies.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createUser(User user){
        this.userRepository.save(user);
    }

    public List<GetUsersResponse> getAllUsers(){

        var result = userRepository.findAll();
        return result.stream().map(
                users -> new GetUsersResponse(
                        users.getId(),
                        users.getName(),
                        users.getUsername(),
                        users.getRoles()
                )).collect(Collectors.toList());
    }

    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public UserCreateResponse create(UserCreateRequest newUser) {
        var usernameFound = userRepository.findByUsername(newUser.getUsername());
        if (usernameFound.isPresent()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "The username already exists");
        }
        if (!isValidPassword(newUser.getPassword())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The password is invalid");
        }
        String encodedPassword = passwordEncoder.encode(newUser.getPassword());

        User modelDb = new User();
        modelDb.setName(newUser.getName());
        modelDb.setUsername(newUser.getUsername());
        modelDb.setPassword(encodedPassword);


        userRepository.save(modelDb);

        return new UserCreateResponse(modelDb);
    }

    public static boolean
    isValidPassword(String password)
    {
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{1,100}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }

}