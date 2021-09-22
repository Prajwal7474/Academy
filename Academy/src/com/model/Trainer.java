package com.model;

public class Trainer {
	
	private int trainerid;
	private String trainer_name;
	private int mobileno;
	
	
	
	
	
	public Trainer(int trainerid, String trainer_name, int mobileno) {
		super();
		this.trainerid = trainerid;
		this.trainer_name = trainer_name;
		this.mobileno = mobileno;
	}
	public int getTrainerid() {
		return trainerid;
	}
	public void setTrainerid(int trainerid) {
		this.trainerid = trainerid;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	

}
