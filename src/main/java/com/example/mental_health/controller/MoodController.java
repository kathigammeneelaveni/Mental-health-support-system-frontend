package com.example.mental_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.mental_health.model.Mood;
import com.example.mental_health.service.MoodService;

import java.util.List;

@RestController
@RequestMapping("/mood")
@CrossOrigin(origins = "http://localhost:3000") 
public class MoodController {

    @Autowired
    private MoodService moodService;

    @PostMapping("/log")
    public ResponseEntity<Mood> logMood(@RequestBody Mood moodEntry) {
        Mood savedMood = moodService.saveMood(
                moodEntry.getUserId(),
                moodEntry.getMood(),
                moodEntry.getDate(),
                moodEntry.getEmotion()
        );
        return ResponseEntity.ok(savedMood);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Mood>> getUserMoods(@PathVariable int userId) {
        return ResponseEntity.ok(moodService.getUserMoods(userId));
    }
}