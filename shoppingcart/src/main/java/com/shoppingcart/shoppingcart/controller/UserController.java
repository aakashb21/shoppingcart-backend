package com.shoppingcart.shoppingcart.controller;


import com.shoppingcart.shoppingcart.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/checkUsername", method = RequestMethod.GET)
    private ResponseEntity<?> checkUsername(@RequestParam String username) {

        if(userRepository.findByUserName(username).isEmpty()) {
            return ResponseEntity.badRequest().body("Username not found");
        } else {
            return ResponseEntity.ok().body("Username found");
        }
    }

    //  create a session for a valid user
    @RequestMapping(value = "/createSession", method = RequestMethod.POST)
    private ResponseEntity<?> createSession(@RequestParam String username) {
        if (userRepository.findByUserName(username).isEmpty()) {
            return ResponseEntity.badRequest().body("Invalid username");
        } else {
            // Logic to create a session (e.g., generate a token or store session details)
            String token = java.util.UUID.randomUUID().toString(); // Generate a unique token

            // Optionally, store the token in a database or cache for session management
            return ResponseEntity.ok().body("Session created for user: " + username + ", Token: " + token);
        }
    }

}
