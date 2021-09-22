package com.dao;
import java.util.List;
import com.model.Student;

public interface Studentdao{
		boolean addStudent(Student s);
		boolean deleteStudent(int id);
		boolean updateStudent(Student s);
		List<Student> getAllStudent();

	}



