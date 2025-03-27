package com.example.mental_health.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "mood_tracker")
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "mood", nullable = false, length = 50)
    private String mood;

    @Column(name = "log_date", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime logDate;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "emotion")
    private String emotion;

    // Constructors
    public Mood() {}

    public Mood(int userId, String mood, LocalDate date, String emotion) {
        this.userId = userId;
        this.mood = mood;
        this.date = date;
        this.emotion = emotion;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }

    public LocalDateTime getLogDate() { return logDate; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getEmotion() { return emotion; }
    public void setEmotion(String emotion) { this.emotion = emotion; }
}