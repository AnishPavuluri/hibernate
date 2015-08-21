package exception;

public class ExceptionTest {
	public static void unchecked(){
		throw new UncheckedException("Unchecked Exception Message");
	}
	
	public static void checked(){
		//throw new CheckedException("Checked Exception Message");
	}
	public static void main(String[] args) {
		unchecked();
		System.out.println("----------");

	}

}
