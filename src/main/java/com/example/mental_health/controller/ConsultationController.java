package com.example.mental_health.controller;

import com.example.mental_health.model.Consultation;
import com.example.mental_health.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/consultations")
@CrossOrigin(origins = "http://localhost:3000") 
public class ConsultationController {

    @Autowired
    private ConsultationService consultationService;

    // Add a new consultation
    @PostMapping("/add")
    public Consultation addConsultation(@RequestBody Consultation consultation) {
        return consultationService.saveConsultation(consultation);
    }

    // Get all consultations
    @GetMapping("/all")
    public List<Consultation> getAllConsultations() {
        return consultationService.getAllConsultations();
    }

    // Get consultation by ID
    @GetMapping("/{id}")
    public Optional<Consultation> getConsultationById(@PathVariable Long id) {
        return consultationService.getConsultationById(id);
    }

    // Get consultations by User ID
    @GetMapping("/user/{userId}")
    public List<Consultation> getConsultationsByUser(@PathVariable Long userId) {
        return consultationService.getConsultationsByUserId(userId);
    }

    // Delete consultation
    @DeleteMapping("/delete/{id}")
    public void deleteConsultation(@PathVariable Long id) {
        consultationService.deleteConsultation(id);
    }
}