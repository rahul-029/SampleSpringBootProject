package com.rahul.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentListController {
	
	@GetMapping("/students")
	public List<Student> getListOfStudents(){
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Scarlet", "Johanson"));
		students.add(new Student("Kiara", "Advani"));
		students.add(new Student("Kareena", "Kapoor"));
		
		return students;
	}

}
