package com.ihackit.model.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ihackit.model.HibernateSessionFactory;
import com.ihackit.model.Student;
import com.ihackit.model.dao.StudentDAO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private Session session = HibernateSessionFactory.getSessionFactory().openSession();

	public void add(Student student) {
		session.save(student);
	}

	public void edit(Student student) {
		session.update(student);
	}

	public void delete(int studentId) {
		session.delete(get(studentId));
	}

	public Student get(int studentId) {
		System.out.println("dao - " + studentId);
		System.out.println("dao - " + session);
		return (Student) session.get(Student.class, studentId);
	}

	public List getAll() {
		return session.createQuery("from Student").list();
	}
}
