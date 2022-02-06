package com.rahul.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

	// RestAPI to return a bean
	@GetMapping("/student")
	public Student getStudent() {
		
		return new Student("Tony", "Stark");
	}

}
