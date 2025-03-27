package com.example.mental_health.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mental_health.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
	
}
