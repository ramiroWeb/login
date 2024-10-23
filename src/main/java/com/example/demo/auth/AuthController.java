package com.example.demo.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	public AuthController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping(value = "login")
	public String login() {
		return "Login from endpoint";
	}
	@PostMapping(value = "register")
	public String register() {
		return "Register from endpoint";
	}
}
