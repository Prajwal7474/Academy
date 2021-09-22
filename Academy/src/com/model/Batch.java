package com.model;

public class Batch {
    private int batch_id;
	private String batchname;
    private  int trainer_id;
    
     public Batch(int batch_id, String batchname, int trainer_id) {
		super();
		this.batch_id = batch_id;
		this.batchname = batchname;
		this.trainer_id = trainer_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
    
	
	
	
    

}
