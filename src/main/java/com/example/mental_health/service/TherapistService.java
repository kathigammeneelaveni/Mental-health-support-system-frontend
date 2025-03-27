package com.example.mental_health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mental_health.model.Therapist;
import com.example.mental_health.repository.TherapistRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TherapistService {
    @Autowired
    private TherapistRepository therapistRepository;

    // Get all therapists
    public List<Therapist> getAllTherapists() {
        return therapistRepository.findAll();
    }

    // Get therapist by ID
    public Optional<Therapist> getTherapistById(Long id) {
        return therapistRepository.findById(id);
    }

    // Add a new therapist
    public Therapist addTherapist(Therapist therapist) {
        return therapistRepository.save(therapist);
    }

    // Delete a therapist
    public void deleteTherapist(Long id) {
        therapistRepository.deleteById(id);
    }
}
