package com.ihackit.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ihackit.model.Student;
import com.ihackit.model.dao.StudentDAO;
import com.ihackit.model.dao.impl.StudentDAOImpl;
import com.ihackit.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();
	
	public void add(Student student) {
		studentDAO.add(student);
	}

	public void edit(Student student) {
		studentDAO.edit(student);
	}

	public void delete(int studentId) {
		studentDAO.delete(studentId);
	}

	public Student get(int studentId) {
		System.out.println("service - " + studentId);
		return studentDAO.get(studentId);
	}

	public List getAll() {
		return studentDAO.getAll();
	}

}
