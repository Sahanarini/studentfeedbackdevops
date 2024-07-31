package com.rest.service;

import java.util.List;

import com.rest.model.Feedback;


public interface FeedbackService {

	public void addLeave(Feedback lv);

	public Feedback getLeave(int lid);

	public List<Feedback> getAllLeaves();

	public void updateLeave(Feedback lv);

	public void deleteLeave(int lid);
}
