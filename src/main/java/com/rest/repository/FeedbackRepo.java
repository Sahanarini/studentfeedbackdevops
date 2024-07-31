package com.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rest.model.Feedback;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer>  {
	
	@Query("select lid from Feedback")
	List<Integer> fetchAllLids();

}
