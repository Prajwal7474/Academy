package com.dao;
import java.util.List;

import com.configuration.Mysql_Configuration;
import com.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	
	public class Studentdaoimplimentation implements Studentdao {

		public Studentdaoimplimentation() {
		}

		@Override
		public List<Student> getAllStudent() {
			ArrayList<Student> bookList = new ArrayList<>();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			final String QUERY = "select * from student";
			try {
				connection =Mysql_Configuration .getConnection();
				preparedStatement = connection.prepareStatement(QUERY);
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Student student = new Student();
					student.setStudent_id(resultSet.getInt("Student_id"));
					student.setStudent_name(resultSet.getString("Student_name"));
					student.setStudentmob_no(resultSet.getString("mob_no"));
					student.setStudentbatch(resultSet.getInt("batch"));
					studentList.add(student);

				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					if (resultSet != null)
						resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if (preparedStatement != null)
						preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if (connection != null)
						connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return bookList;
		}

		@Override
		public int addStudent(Student student) {
			System.out.println(student);
			int status = 0;
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			try {
				connection = Mysql_Configuration.getConnection();
				preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");
				preparedStatement.setInt(1,student.getStudent_id());
				preparedStatement.setString(2, student.getStudent_name());
				preparedStatement.setInt(3, student.getMob_no());
				preparedStatement.setString(4, student.getBatch());
				status=preparedStatement.executeUpdate();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
					try {
						if(preparedStatement!=null)
						preparedStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						if(connection!=null)
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			// TODO Auto-generated method stub
			return status;
		}

		@Override
		public boolean addStudent(Student s) {
			// TODO Auto-generated method stub
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
		
		
	}



