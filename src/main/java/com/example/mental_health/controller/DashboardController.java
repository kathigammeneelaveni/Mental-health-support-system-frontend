package com.example.mental_health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mental_health.service.DashboardService;
import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/dashboard") 
@CrossOrigin(origins = "http://localhost:3000")  
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/stats")
    public Map<String, Long> getDashboardStats() {
        return Map.of(
            "totalMoodLogs", dashboardService.getTotalMoodLogs(),
            "upcomingConsultations", dashboardService.getUpcomingConsultations(),
            "totalForumPosts", dashboardService.getTotalForumPosts()
        );
    }

    @GetMapping("/recent-activities")
    public List<String> getRecentActivities() {
        return dashboardService.getRecentActivities();
    }
}