package com.dao;

import com.configuration.Mysql_Configuration;
import com.model.Stud_Test;
import com.model.Student;

import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


	public class Stud_Testdaoimplimentation implements Stud_Testdao
	{
		
		private boolean validateStudent(Stud_Test st) {
			return true;
		}


	
		@Override
		public boolean addStudentTestMarks(Stud_Test st) {
		
			if(validateStudent(st))
			{
			
					try(Connection con=Mysql_Configuration.getConnection();
							PreparedStatement pst=con.prepareStatement("insert into stud_test values(?,?,?,?,?)"))
					{
						
						
						
						pst.setInt(1,st.getStud_id());
						pst.setInt(2, st.getMarks());
						pst.setInt(3, st.getTest_id());
	
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
				pst.setInt(2, marks);
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
				pst.setInt(2, s.getmarks());

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
					s.setmarks(s.getInt(2));
					studentlist.add(s);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return studentlist;
		}





		@Override
		public boolean deleteTest(int id) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public boolean updateTest(Stud_Test st) {
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public List<Stud_Test> getAllStud_Test() {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public boolean updateMarks(int marks) {
			// TODO Auto-generated method stub
			return false;
		}



		@Override
		public boolean deleteMarks(int marks) {
			// TODO Auto-generated method stub
			return false;
		}



		public boolean updateTest(int marks) {
			// TODO Auto-generated method stub
			return false;
		}
	}

		
