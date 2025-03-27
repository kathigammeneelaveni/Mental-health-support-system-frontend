package com.example.mental_health.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mental_health.repository.MoodRepository;
import com.example.mental_health.repository.ConsultationRepository;
import com.example.mental_health.model.Activity;
import com.example.mental_health.repository.ActivityRepository;
import com.example.mental_health.repository.CommunityForumRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardService {

    @Autowired
    private MoodRepository moodLogRepository;

    @Autowired
    private ConsultationRepository consultationRepository;

    @Autowired
    private CommunityForumRepository forumPostRepository;

    @Autowired
    private ActivityRepository activityRepository;

    public long getTotalMoodLogs() {
        return moodLogRepository.count();
    }

    public long getUpcomingConsultations() {
        return consultationRepository.count();
    }

    public long getTotalForumPosts() {
        return forumPostRepository.count();
    }

    public List<String> getRecentActivities() {
        List<Activity> activities = activityRepository.findAll();
        return activities.stream()
                .map(a -> a.getDescription() + " on " + a.getDate())
                .collect(Collectors.toList());
    }
}