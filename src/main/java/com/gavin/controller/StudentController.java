package com.gavin.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gavin.entity.Student;
import com.gavin.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents()
	{
		return this.studentService.getALLStudents();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id)
	{
		return this.studentService.getStudentById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeStudentById(@PathVariable("id") int id)
	{
		this.studentService.removeStudentById(id);
	}
	
	
	public void updateStudent(Student student)
	{
		
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudentToDb(@RequestBody Student student)
	{
		this.studentService.insertStudentToDb(student);
	}
}
