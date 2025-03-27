package com.example.mental_health.dto;

public class LoginResponse {
	private Long id;
    private String name;
    private String email;
    private String token;
    
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginResponse(Long id, String name, String email, String token) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.token = token;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getToken() {
		return token;
	}
}
