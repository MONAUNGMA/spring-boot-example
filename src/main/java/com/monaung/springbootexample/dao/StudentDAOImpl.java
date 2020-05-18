package com.monaung.springbootexample.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monaung.springbootexample.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Student> get() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Student> query =  currentSession.createQuery("from Student", Student.class);
		List<Student> list = query.getResultList();
		return list;
	}

	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Student student = currentSession.get(Student.class, id);
		return student;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(student);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Student studentObj = currentSession.get(Student.class, id);
		currentSession.delete(studentObj);
	}

}
