package com.dao;

import java.util.List;
import com.model.Student;

public interface Studentdao {
	public boolean deleteStudent(int id);

	public boolean updateStudent(Student s);

	List<Student> getAllStudent();

	boolean addStudent(Student s);

}
