package com.model;

public class Test {
private int test_id;
private String testname;





public Test(int test_id, String testname) {
	super();
	this.test_id = test_id;
	this.testname = testname;
}
public int getTest_id() {
	return test_id;
}
public void setTest_id(int test_id) {
	this.test_id = test_id;
}
public String getTestname() {
	return testname;
}
public void setTestname(String testname) {
	this.testname = testname;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}




}
