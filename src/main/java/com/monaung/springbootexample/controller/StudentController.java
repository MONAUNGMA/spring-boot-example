package com.monaung.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monaung.springbootexample.model.Student;
import com.monaung.springbootexample.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> get(){
		return studentService.get();
	}
	
	@GetMapping("/student/{id}")
	public Student get(@PathVariable int id) {
		Student studentObj = studentService.get(id);
		if(studentObj == null) {
			throw new RuntimeException("Student with id : "+id+" is not found");
		}
		return studentObj;
	}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public String delete(@PathVariable int id) {
		studentService.delete(id);
		return "Student id : "+id+" was deleted";
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student student) {
		studentService.save(student);
		return student;
	}
	
	
}
