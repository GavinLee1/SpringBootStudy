package com.gavin.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.gavin.dao.StudentDAO;
import com.gavin.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	@Qualifier("fakeData")
	private StudentDAO studentDAO;
	
	public Collection<Student> getALLStudents()
	{
		return this.studentDAO.getAllStudents();
	}
	
	public Student getStudentById(int id)
	{
		return this.studentDAO.getStudentById(id);
	}
	
	public void removeStudentById(int id)
	{
		this.studentDAO.removeStudentById(id);
	}
	
	public void updateStudent(Student student)
	{
		this.studentDAO.updateStudent(student);
	}
	
	public void insertStudentToDb(Student student)
	{
		this.studentDAO.insertStudentToDb(student);
	}
}
