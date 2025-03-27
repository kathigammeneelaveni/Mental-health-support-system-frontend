package com.example.mental_health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mental_health.model.User;
import com.example.mental_health.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ✅ Validate User Login
    public Optional<String> validateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);

        if (userOptional.isEmpty()) {
            return Optional.of("User with this email does not exist.");
        }

        User user = userOptional.get();
        if (!user.getPassword().equals(password)) {
            return Optional.of("Incorrect password.");
        }

        return Optional.empty();  // No errors, valid login
    }

    // ✅ Register User (Signup)
    public String registerUser(String name, String email, String password) {
        if (userRepository.findByEmail(email).isPresent()) {
            return "Email already exists!";
        }

        User newUser = new User();
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setPassword(password);  // ✅ No Encryption (As per your request)
        userRepository.save(newUser);

        return "User registered successfully!";
    }
}
