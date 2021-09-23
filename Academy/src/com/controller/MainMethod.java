package com.controller;

import com.model.Stud_Test;
import com.model.Student;
import java.util.Scanner;

import com.dao.Stud_Testdaoimplimentation;
import com.dao.Studentdao;
import com.dao.Studentdaoimplimentation;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Studentdaoimplimentation sdao=new Studentdaoimplimentation();
		Stud_Testdaoimplimentation stest=new Stud_Testdaoimplimentation();
				
				
		do
		{
			System.out.println(" ************* Welcome To Training Academy************");
			System.out.println("1.Add new student");
			System.out.println("2.Delete student");
			System.out.println("3.Modify student details");
			System.out.println("4.Add marks of students  ");

			System.out.println("5.Update marks of students ");
			System.out.println("6.Delete results of students. ");
			System.out.println("0-Exit");
		
			System.out.println("enter your choice::");
			int ch = sc.nextInt();
			
			switch (ch) 
			{
			case 1:
				System.out.println("Enter Student_id , Student_name , Mob_no , batch ");
				int student_id= sc.nextInt();
				String student_name = sc.next();
				long mob_no = sc.nextInt();
			    int batchid = sc.nextInt();
				Student student = new Student(student_id,student_name,mob_no,batchid);
				
				boolean isinsert = sdao.addStudent(student);
				if(isinsert)
					System.out.println("Record added successfully");
				else
					System.out.println("Insert Unsuccessfully");
				break;

			case 2:
				System.out.println("Enter student id ");
				int sid= sc.nextInt();
				boolean isdelete = sdao.deleteStudent(sid);
				if(isdelete)
					System.out.println("Record deleted successfully");
				else
					System.out.println("delete Unsuccessfully");
				break;
				
			case 3:
				System.out.println("Enter student id to update");
				int id= sc.nextInt();
				System.out.println("Enter new name,mobile,batch");
				student_name = sc.next();
				 mob_no = sc.nextInt();
				 batchid = sc.nextInt();
				Student s1 = new Student(id,student_name,mob_no,batchid);
				boolean isupdate=sdao.updateStudent(s1);
				if(isupdate)
					System.out.println("Record updated successfully");
				else
					System.out.println("Update Unsuccessfully");
				break;
				
			case 4:
				System.out.println("Enter stud_id , test_id , marks");
				int stud_id= sc.nextInt();
				int test_id = sc.nextInt();
				int marks = sc.nextInt();
				Stud_Test stud_test = new Stud_Test(stud_id,test_id,marks);
				
			     boolean isadded = stest.addStudentTestMarks(stud_test);
				if(isadded)
					System.out.println("Record added successfully");
				else
					System.out.println("Insert Unsuccessfully");
				break;
				
				
			case 5:
				
				  System.out.println("Enter student marks"); 
				 int updatemarks= sc.nextInt();
			    boolean isupdateStudent = stest.updateTest(updatemarks);
				if(isupdateStudent)
					  System.out.println("Record updated successfully");
				  else
				 
					System.out.println("updated Unsuccessfully");
				break;
				
			case 6:
				System.out.println("enter delete marks");
				int deletemarks=sc.nextInt();
				boolean isdeleted = sdao.deletedmarks(deletemarks);
				if(isdeleted)
					System.out.println("marks deleted successfully");
				else
					System.out.println("marks deleted unsuccessfully");
				break;
				
				
				
				case 7:
					System.out.println("Exit");
					
				
				
				
				
			}	
			if(ch==0)
				break;
			
		} while (true);
		System.out.println("Thanks!!");


	}

}
