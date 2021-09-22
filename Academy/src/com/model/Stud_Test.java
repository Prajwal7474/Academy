package com.model;

public class Stud_Test {
	
	private int stud_id;
	private int test_id;
	private int marks;
	
	
	
	
	
	public Stud_Test(int stud_id, int test_id, int marks) {
		super();
		this.stud_id = stud_id;
		this.test_id = test_id;
		this.marks = marks;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public int getTest_id() {
		return test_id;
	}
	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
