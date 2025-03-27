package com.example.mental_health.service;

import com.example.mental_health.model.MotivationalVideo;
import com.example.mental_health.repository.MotivationalVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MotivationalVideoService {
    @Autowired
    private final MotivationalVideoRepository videoRepository;

    public MotivationalVideoService(MotivationalVideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<MotivationalVideo> getVideosByMood(String mood) {
        return videoRepository.findByMood(mood);
    }
}
