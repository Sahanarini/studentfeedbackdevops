package com.rest.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Feedback;
import com.rest.repository.FeedbackRepo;
import com.rest.service.FeedbackService;

@Service
public class FeedbackImp implements FeedbackService {

	@Autowired
	FeedbackRepo repo;	
	
	@Override
	public void addLeave(Feedback lv) {
		repo.save(lv);
		
	}

	@Override
	public Feedback getLeave(int lid) {
	    Optional<Feedback> leaveOptional = repo.findById(lid);
	    return leaveOptional.orElse(null);
	}


	@Override
	public List<Feedback> getAllLeaves() {
		return repo.findAll();
	}

	@Override
	public void updateLeave(Feedback lv) {
		repo.save(lv);
		
	}

	@Override
	public void deleteLeave(int lid) {
		repo.deleteById(lid);
	}
	
	public List<Integer> getAllLids() {
		return repo.fetchAllLids();		
	}

}
