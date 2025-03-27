package com.example.mental_health.controller;

import com.example.mental_health.model.MotivationalVideo;
import com.example.mental_health.service.MotivationalVideoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
@CrossOrigin("*")
public class MotivationalVideoController {

    private final MotivationalVideoService videoService;

    public MotivationalVideoController(MotivationalVideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/{mood}")
    public List<MotivationalVideo> getVideosByMood(@PathVariable String mood) {
        return videoService.getVideosByMood(mood);
    }
}