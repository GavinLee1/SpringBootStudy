package com.gavin.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gavin.dao.StudentDAO;
import com.gavin.entity.Student;

@Repository
@Qualifier("fakeData")
public class MongoStudentDAOImpl implements StudentDAO{
private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1, "Said", "Computer Science"));
				put(2, new Student(2, "Alex U", "Finance"));
				put(3, new Student(3, "Anna", "Maths"));
			}
		};
	}
	
	@Override
	public Collection<Student> getAllStudents() {
		return this.students.values();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return this.students.get(id);
	}

	@Override
	public void removeStudentById(int id) {
		this.students.remove(id);
		
	}

	@Override
	public void updateStudent(Student student) {
		Student stu = students.get(student.getId());
		stu.setCourse(student.getCourse());
		stu.setName(student.getName());
		this.students.put(student.getId(), stu);
		
	}

	@Override
	public void insertStudentToDb(Student student) {
		this.students.put(student.getId(), student);
		
	}
}
