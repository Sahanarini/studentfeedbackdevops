package com.rest.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employ_tbl")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String dept;
	@Column
	private int batch;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Feedback.class)
	@JoinColumn(name="lidd")
	private Feedback feed;

	public Student() {
		super();
	}

	

	public Student(int id, String name, String dept, int batch, Feedback feed) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.batch = batch;
		this.feed = feed;
	}



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	

	public int getBatch() {
		return batch;
	}



	public void setBatch(int batch) {
		this.batch = batch;
	}



	public Feedback getFeed() {
		return feed;
	}

	public void setFeed(Feedback feed) {
		this.feed = feed;
	}

	

}
