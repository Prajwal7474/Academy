package com.dao;

import com.configuration.Mysql_Configuration;
import com.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
	import java.sql.SQLException;
import java.util.List;


public class Studentdaoimplimentation implements Studentdao
{
	
	private boolean validateStudent(Student s) {
		return true;
	}


	@Override
	public boolean addStudent(Student s) {
	
		if(validateStudent(s))
		{
		
				try(Connection con=Mysql_Configuration.getConnection();
						PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)"))
				{
					
					
					pst.setInt(1,s.getStudent_id());
					pst.setString(2,s.getStudent_name());
					pst.setString(3,s.getBatch());
					pst.setInt(4,s.getMob_no());
				
					int c=pst.executeUpdate();
					
					if(c>0)
						return true;
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				return false;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	

	

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean deletedmarks(int marks) {
		// TODO Auto-generated method stub
		return false;
	}



	
}





































