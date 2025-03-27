package com.example.mental_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mental_health.model.Therapist;
import com.example.mental_health.repository.TherapistRepository;

import java.util.List;

@RestController
@RequestMapping("/api/therapists")
@CrossOrigin("*")
public class TherapistController {
    
    @Autowired
    private TherapistRepository therapistRepository;

    // Get all therapists
    @GetMapping
    public List<Therapist> getAllTherapists() {
        return therapistRepository.findAll();
    }

    // Add a new therapist
    @PostMapping("/add")
    public ResponseEntity<Therapist> addTherapist(@RequestBody Therapist therapist) {
        Therapist savedTherapist = therapistRepository.save(therapist);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTherapist);
    }

    // Add multiple therapists (Bulk Insert)
    @PostMapping("/addMultiple")
    public ResponseEntity<List<Therapist>> addTherapists(@RequestBody List<Therapist> therapists) {
        List<Therapist> savedTherapists = therapistRepository.saveAll(therapists);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTherapists);
    }
}
