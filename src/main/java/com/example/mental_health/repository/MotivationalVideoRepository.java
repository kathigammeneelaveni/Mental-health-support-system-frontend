package com.example.mental_health.repository;

import com.example.mental_health.model.MotivationalVideo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivationalVideoRepository extends JpaRepository<MotivationalVideo, Long> {
	List<MotivationalVideo> findByMood(String mood);
}
