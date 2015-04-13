package com.ihackit.service;

import java.util.List;

import com.ihackit.model.Student;

public interface StudentService {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student get(int studentId);
	public List getAll();
}
