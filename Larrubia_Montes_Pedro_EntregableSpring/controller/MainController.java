package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
	
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/customers")
	public String customers() {
		return "customers";
	}
	
	@GetMapping("/employees")
	public String employees() {
		return "employees";
	}
	
}
