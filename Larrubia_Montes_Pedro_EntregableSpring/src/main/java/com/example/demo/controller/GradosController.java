package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GradosController {
	
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/grados")
	public String customers() {
		return "usuario";
	}
	
		
}
