package com.example.mental_health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mental_health.model.Therapist;

public interface TherapistRepository extends JpaRepository<Therapist, Long> {}
