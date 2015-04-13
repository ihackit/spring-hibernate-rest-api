package com.ihackit.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ihackit.model.Student;
import com.ihackit.service.StudentService;
import com.ihackit.service.impl.StudentServiceImpl;

@RestController
public class StudentController {
	private StudentService studentService = new StudentServiceImpl();
	
    @RequestMapping("/student/get")
    public Student getStudent(@RequestParam(value="id", defaultValue="1") int id) {
    	return studentService.get((int) id);
    }
    
    @RequestMapping("/student/get/all")
    public List getAllStudents() {
    	return studentService.getAll();
    }
}
