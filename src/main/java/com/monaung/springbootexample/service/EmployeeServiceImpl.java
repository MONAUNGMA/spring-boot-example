package com.monaung.springbootexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monaung.springbootexample.dao.EmployeeDAO;
import com.monaung.springbootexample.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
//		return null;
		
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
//		return null;
		
		return employeeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.save(employee);	
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDAO.delete(id);
	}

}
