package com.gavin.entity;

public class Student {
	private int id;
	private String name;
	private String course;
	
	
	public Student() {
		super();
	}
	
	public Student(int age, String name, String course) {
		super();
		this.id = age;
		this.name = name;
		this.course = course;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int age) {
		this.id = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
