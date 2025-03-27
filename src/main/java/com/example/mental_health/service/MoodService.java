package com.example.mental_health.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mental_health.model.Mood;
import com.example.mental_health.repository.MoodRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class MoodService {

    @Autowired
    private MoodRepository moodRepository;

    public Mood saveMood(int userId, String mood, LocalDate date, String emotion) {
        Mood newMood = new Mood(userId, mood, date, emotion);
        return moodRepository.save(newMood);
    }

    public List<Mood> getUserMoods(int userId) {
        return moodRepository.findByUserId(userId);
    }
}