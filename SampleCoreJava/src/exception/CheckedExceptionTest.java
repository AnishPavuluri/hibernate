package exception;

public class CheckedExceptionTest {
	public static void main(String[] args) {
		try{
			throw new RuntimeException();
		}catch (Throwable e) {
			System.out.println("%%%%%%%%5");
		}
		System.out.println("$$$$$$$$$$$$$$4");
	}
	
}
