package edu.model;

public class MBAStudent extends Student {
	private String mbaStream;
	public MBAStudent(String studentName,String mbaStream){
		super(studentName);
		this.mbaStream=mbaStream;
	}
	public String getMbaStream(){
		return mbaStream;
	}
	public void setMbaStream(String mbaStream){
		this.mbaStream=mbaStream;
	}

}
