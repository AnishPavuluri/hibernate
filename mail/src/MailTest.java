

public class MailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SendMail sendMail = new SendMail();
		boolean b = sendMail.sendMail("anish87mca11@gmail.com");
		System.out.println("---->"+b);

	}

}
