package com.monaung.springbootexample.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monaung.springbootexample.dao.StudentDAO;
import com.monaung.springbootexample.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Transactional
	@Override
	public List<Student> get() {
		// TODO Auto-generated method stub
		return studentDAO.get();
	}

	@Transactional
	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		return studentDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		studentDAO.delete(id);
	}

}
