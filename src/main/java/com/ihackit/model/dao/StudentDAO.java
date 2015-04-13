package com.ihackit.model.dao;

import java.util.List;

import com.ihackit.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void edit(Student student);
	public void delete(int studentId);
	public Student get(int studentId);
	public List getAll();
}
