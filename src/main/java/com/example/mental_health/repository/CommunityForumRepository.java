package com.example.mental_health.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mental_health.model.CommunityForum;

import java.util.List;

public interface CommunityForumRepository extends JpaRepository<CommunityForum, Long> {
    List<CommunityForum> findAllByOrderByCreatedAtDesc();
}