package com.example.mental_health.model;

import jakarta.persistence.*;

@Entity
@Table(name = "motivational_videos")
public class MotivationalVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String videoUrl;
    private String mood;
    
	public MotivationalVideo(Long id, String title, String description, String videoUrl) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.videoUrl = videoUrl;
		this.mood = mood;
	}
	
	
	public MotivationalVideo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getMood() {
		return mood;
	}
	public void setMood(String mood) {
		this.mood = mood;
	}

    
}