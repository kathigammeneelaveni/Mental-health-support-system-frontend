package com.example.mental_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mental_health.model.CommunityForum;
import com.example.mental_health.service.CommunityForumService;

import java.util.List;

@RestController
@RequestMapping("/forum")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend to access
public class CommunityForumController {

    @Autowired
    private CommunityForumService forumService;

    @GetMapping("/all")
    public List<CommunityForum> getAllDiscussions() {
        return forumService.getAllDiscussions();
    }

    @PostMapping("/create")
    public CommunityForum createDiscussion(@RequestBody CommunityForum forum) {
        return forumService.createDiscussion(forum);
    }
}