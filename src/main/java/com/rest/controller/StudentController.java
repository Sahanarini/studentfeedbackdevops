package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.implementation.StudentImp;
import com.rest.model.Student;

@RestController
@RequestMapping("/emp")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	StudentImp service;

	@PostMapping
	public String insertStudent(@RequestBody Student emp) {
		String msg = "";
		try {
			service.addEmployee(emp);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;

	}

	@GetMapping("{id}")
	public Student readStudent(@PathVariable("id") int id) {

		return service.getEmployee(id);
	}

	@GetMapping("/all")
	public List<Student> getStudents() {

		return service.getAllEmployees();
	}

	@PutMapping
	public String updateStudent(@RequestBody Student stud) {
		String msg = "";
		try {
			service.updateEmployee(stud);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;

	}

	@DeleteMapping("{id}")
	public String delStudent(@PathVariable("id") int id) {
		String msg = "";
		try {
			service.deleteEmployee (id);
			msg = "deleted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "not deleted";
		}

		return msg;
	}

}
