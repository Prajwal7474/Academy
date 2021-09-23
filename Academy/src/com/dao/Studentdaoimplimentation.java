package com.dao;

import com.configuration.Mysql_Configuration;
import com.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
						PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?)"))
				{
					
					
					pst.setInt(1,s.getStudent_id());
					pst.setString(2,s.getStudent_name());
					pst.setLong(3,s.getMob_no());
					pst.setInt(4,s.getBatch());
				
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
	
	
	
	
	public boolean deletedStudent(int id) {
		try (Connection con = Mysql_Configuration.getConnection();
				PreparedStatement pst = con.prepareStatement("delete from student where studentid=: where studentmarks=:")) {
			pst.setInt(1,id);
		   pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public boolean updatedStudent(Student s) {
		try (Connection con = Mysql_Configuration.getConnection();
				
				PreparedStatement pst = con.prepareStatement("update student set studentname=: where studentid=: where studentmarks=:")) {
			pst.setInt(1, s.getStudent_id());
			pst.setString(2, s.getStudent_name());
			
			pst.setInt(3, s.getBatch());
			pst.executeUpdate();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	
	public List<Student> getAllStudent() 
	{
		ArrayList<Student> studentlist = new ArrayList<>();
		
		try (Connection con = Mysql_Configuration.getConnection();
				PreparedStatement pst = con.prepareStatement("select * from role")) {

			ResultSet s = pst.executeQuery();

			while (s.next()) {
				Student s = new Student();
				
				s.setStudent_id(s.getInt(1));
				s.setStudent_name(s.getString(2));
				s.setsBatch(s.getInt(3));
				studentlist.add(s);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentlist;
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





































