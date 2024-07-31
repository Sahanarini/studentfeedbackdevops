package com.rest.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Student;
import com.rest.repository.StudentRepo;
import com.rest.service.StudentService;

@Service
public class StudentImp implements StudentService {
	
	@Autowired
	StudentRepo repo;

	@Override
	public void addEmployee(Student emp) {
		repo.save(emp);
		
	}

	@Override
	public Student getEmployee(int id) {
		Optional<Student> employeeOptional = repo.findById(id);
		return employeeOptional.orElse(null);
	}

	@Override
	public List<Student> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public void updateEmployee(Student emp) {
		repo.save(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
		
	}

}
