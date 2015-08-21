package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(converDateToString(new Date(), "DD:MM:yyyy hh:mm"));
		
	}
	
	public static String converDateToString(Date date, String formate){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formate);
		return simpleDateFormat.format(date);
	}

}
