package edu.exception;

public class Add {
	public void addition(Integer a, Integer b) throws Exception{
		System.out.println(a+b);
		throw new Exception();
	}

}
