package com.model;

public class Student {

	private int student_id;
	private String student_name;
	private long mob_no;
	private int batch;
	
	public Student(int student_id, String student_name, long mob_no, int batch) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.mob_no = mob_no;
		this.batch = batch;
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	
	
	
	
	
}
