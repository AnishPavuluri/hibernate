package edu.exception;

public class ExceptionTest1 {
	public static void exceptionchain() throws CheckedException{
		try{
			try{
				throw new NullPointerException("IllegaAccesException"); 
			}catch (NullPointerException e) {
				System.out.println("inner Exception");
				throw new IllegalAccessException("Four");
			}catch (ArithmeticException e) {
				System.out.println("inner Exception");
				throw new RuntimeException("Four");
			}
		}catch (Exception e) {
			System.out.println("####what was the cause:");
		}
		
	}
	public static void main(String[] args) {
		try{
			exceptionchain();
		}catch (Exception e) {
			System.out.println("Exception in main");
		}

	}

}
