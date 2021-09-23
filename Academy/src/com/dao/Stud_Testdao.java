package com.dao;

import java.util.List;

import com.model.Stud_Test;

public interface Stud_Testdao {
	boolean deleteTest(int id);

	boolean updateTest(Stud_Test st);
	boolean updateMarks(int marks);
	boolean deleteMarks(int marks);

	List<Stud_Test> getAllStud_Test();

	boolean addStudentTestMarks(Stud_Test st);

}
