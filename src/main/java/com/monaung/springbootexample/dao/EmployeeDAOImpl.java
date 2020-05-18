package com.monaung.springbootexample.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monaung.springbootexample.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
//		return null;
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
//		return null;
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		return employeeObj;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
//		currentSession.save(employee);
		currentSession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee employeeObj = currentSession.get(Employee.class, id);
		currentSession.delete(employeeObj);
		
	}

}
