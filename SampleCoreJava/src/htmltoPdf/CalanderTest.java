package htmltoPdf;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalanderTest {
	public static void main(String[] args) {
		Calendar c1 = new GregorianCalendar();
		c1.set(2012, 2, 20, 20, 7, 01);
		Date d1 = null;
		Calendar c2 = new GregorianCalendar();
		c2.set(2012, 1, 20, 20, 7, 01);
		Date d2 = null;
		System.out.println("before---------->"+d1.before(d2));
		//System.out.println(d2.compareTo(d1));
		//System.out.println("compareTo------->"+((d2.compareTo(d1)) >= 0));

	}

}
