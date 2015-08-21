package edu.model;

public class MCAStudent extends Student{
	private String mcaStream;
	public MCAStudent(String studentName,String mcaStream){
		super(studentName);
		this.mcaStream=mcaStream;
	}
	public String getMcaStream(){
		return mcaStream;
	}
	public void setMcaStream(String mcaStream){
		this.mcaStream=mcaStream;
	}

}
