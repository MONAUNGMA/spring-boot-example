package com.monaung.springbootexample.dao;

import java.util.List;

import com.monaung.springbootexample.model.Student;

public interface StudentDAO {

	List<Student> get();
	
	Student get(int id);
	
	void save(Student student);
	
	void delete(int id);
	
}
