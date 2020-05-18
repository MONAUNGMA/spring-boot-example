package com.monaung.springbootexample.dao;

import java.util.List;

import com.monaung.springbootexample.model.Employee;

public interface EmployeeDAO {

	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}
