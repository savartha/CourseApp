package com.sai.home.CourseApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@GetMapping("/")
	public String getCourses() {
		return "Java Spring";
	}

}
