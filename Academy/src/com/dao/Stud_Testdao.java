package com.dao;

import java.util.List;

import com.model.Stud_Test;
import com.model.Student;

public interface Stud_Testdao {
	
  
	boolean updateTestMarks(Stud_Test st);
	boolean deleteMarks(Student marks);
     boolean addStudentTestMarks(Stud_Test st);

}
