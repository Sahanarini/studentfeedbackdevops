package com.rest.service;

import java.util.List;

import com.rest.model.Student;

public interface StudentService {
	
	public void addEmployee(Student emp);
	public Student getEmployee(int id);
	public List<Student> getAllEmployees();
	public void updateEmployee(Student emp);
	public void deleteEmployee(int id);

}
