package com.model;

public class Student {

	private int student_id;
	private String student_name;
	private int mob_no;
	private String batch;
	
	public Student(int student_id, String student_name, int mob_no, String batch) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.mob_no = mob_no;
		this.batch = batch;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getMob_no() {
		return mob_no;
	}
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
	
	
}
