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

import com.rest.implementation.FeedbackImp;
import com.rest.model.Feedback;



@RestController 
@RequestMapping("/leave")
@CrossOrigin("*")
public class FeedbackController {
	
	@Autowired
	FeedbackImp service;

	@PostMapping
	public String insertLeave(@RequestBody Feedback lv) {
		String msg = "";
		try {
			service.addLeave(lv);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;

	}

	@GetMapping("{lid}")
	public Feedback readLeave(@PathVariable("lid") int lid) {

		return service.getLeave(lid);
	}

	@GetMapping("/all")
	public List<Feedback> getLeaves() {

		return service.getAllLeaves();
	}

	@PutMapping
	public String updateLeave(@RequestBody Feedback lv) {
		String msg = "";
		try {
			service.updateLeave(lv);
			msg = "success";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "failure";
		}

		return msg;

	}

	@DeleteMapping("{lid}")
	public String delLeave(@PathVariable("lid") int lid) {
		String msg = "";
		try {
			service.deleteLeave(lid);
			msg = "deleted";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "not deleted";
		}

		return msg;
	}
	
	@GetMapping("/idList")
	public List<Integer> getAllLids(){
		return service.getAllLids();
		
	}

}
