package com.monaung.springbootexample.service;

import java.util.List;

import com.monaung.springbootexample.model.Student;

public interface StudentService {

	List<Student> get();
	
	Student get(int id);
	
	void save(Student student);
	
	void delete(int id);
	
}
