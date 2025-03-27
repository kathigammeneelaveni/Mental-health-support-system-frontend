package com.example.mental_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mental_health.service.AuthService;

import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")  
public class AuthController {

    @Autowired
    private AuthService authService;

    // ✅ Login Endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> request) {
        String email = request.get("email");
        String password = request.get("password");

        // Validate user credentials
        Optional<String> validationMessage = authService.validateUser(email, password);

        if (validationMessage.isPresent()) {
            return ResponseEntity.badRequest().body(Map.of("message", validationMessage.get()));
        }

        return ResponseEntity.ok(Map.of("message", "Login successful!"));
    }

    // ✅ Signup (User Registration) Endpoint
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        String email = request.get("email");
        String password = request.get("password");

        if (name == null || email == null || password == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "All fields are required!"));
        }

        try {
            String response = authService.registerUser(name, email, password);
            return ResponseEntity.ok(Map.of("message", response));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "Signup failed!"));
        }
    }
}
