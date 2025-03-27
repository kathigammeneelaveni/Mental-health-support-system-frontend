package com.example.mental_health.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mental_health.model.CommunityForum;
import com.example.mental_health.repository.CommunityForumRepository;

import java.util.List;

@Service
public class CommunityForumService {

    @Autowired
    private CommunityForumRepository forumRepository;

    public List<CommunityForum> getAllDiscussions() {
        return forumRepository.findAllByOrderByCreatedAtDesc();
    }

    public CommunityForum createDiscussion(CommunityForum forum) {
        return forumRepository.save(forum);
    }
}