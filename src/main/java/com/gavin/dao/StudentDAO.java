package com.gavin.dao;
import java.util.Collection;

import com.gavin.entity.Student;

public interface StudentDAO {
	
	Collection<Student> getAllStudents();
	
	Student getStudentById(int id);
	
	void removeStudentById(int id);
	
	void updateStudent(Student student);
	
	void insertStudentToDb(Student student);
}
