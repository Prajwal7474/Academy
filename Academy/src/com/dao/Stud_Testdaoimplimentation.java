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
							PreparedStatement pst=con.prepareStatement("insert into stud_test values(?,?,?)"))
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


		
	
		public boolean deleteStudentMarks(int id) {
			 try {
				 try(Connection con = Mysql_Configuration.getConnection();
				 PreparedStatement pst = con.prepareStatement("delete from Stud_Test where Stud_id=?"))
			       {
					 pst.setInt(1, id);
					 pst.executeUpdate();
			    return true;
			      }
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
			return false;
		}

		public boolean updateStudentMarks(Stud_Test st) {
			try {
		    	Connection con = Mysql_Configuration.getConnection();
		        PreparedStatement pst = con.prepareStatement("update Stud_Test SET marks=? where Stud_id=?");
		       
		        pst.setInt(1, st.getMarks());
				pst.setInt(2,st.getStud_id());
				
				 int recordUpdate = pst.executeUpdate();
			     if(recordUpdate > 0)
			    	 return true;
			    
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    }
				return false;
		}

		

		
		 public List<Stud_Test> getAllStudentTest() {
			try(Connection con= Mysql_Configuration.getConnection();
					PreparedStatement pst = con.prepareStatement("select * from Stud_Test"))
			{
				ArrayList<Stud_Test> studentTestlist = new ArrayList<>();
				ResultSet r = pst.executeQuery();
				
				while(r.next())
				{
			
                    Stud_Test st= new Stud_Test();					
					
					st.setStud_id(r.getInt(1));
					st.setTest_id(r.getInt(2));
					st.setMarks(r.getInt(3));
					studentTestlist.add(st);
				}
				return studentTestlist;
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} 
			return null;
		 }



		@Override
		public boolean updateTestMarks(Stud_Test st) {
			// TODO Auto-generated method stub
			return false;
		}



		@Override
		public boolean deleteMarks(Student marks) {
			// TODO Auto-generated method stub
			return false;
		}

	}



	
		
		
		
		

	


		
		
		
		
		
		
		
		



		

		
