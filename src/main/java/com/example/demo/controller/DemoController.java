package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping(value = "demo")
	public String welcome() {
		return "Welcome form secure endpoint";
	}
	
}
