package com.example.mental_health.service;

import com.example.mental_health.model.Consultation;
import com.example.mental_health.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationService {

    @Autowired
    private ConsultationRepository consultationRepository;

    // Save a consultation request
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    // Get all consultations
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    // Get consultation by ID
    public Optional<Consultation> getConsultationById(Long id) {
        return consultationRepository.findById(id);
    }

    // Get consultations by User ID
    public List<Consultation> getConsultationsByUserId(Long userId) {
        return consultationRepository.findByUserId(userId);
    }

    // Delete consultation by ID
    public void deleteConsultation(Long id) {
        consultationRepository.deleteById(id);
    }
}