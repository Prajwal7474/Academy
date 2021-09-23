package com.dao;

import com.configuration.Mysql_Configuration;
import com.model.Stud_Test;


import java.sql.Connection;
	import java.sql.PreparedStatement;
		import java.sql.SQLException;
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

		
