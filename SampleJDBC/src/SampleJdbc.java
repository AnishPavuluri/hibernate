import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import date.SampleDateTest;


public class SampleJdbc {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String cs = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection connection = DriverManager.getConnection(cs,"system","manager");
		/*PreparedStatement preparedStatement = connection.prepareStatement("insert into student values(?,?,?,?)");*/
		PreparedStatement preparedStatement = connection.prepareStatement("select * from student where sno=53");
		/*preparedStatement.setInt(1,53);
		preparedStatement.setString(2, "Ramana");
		preparedStatement.setString(3, "Atmakur");
		preparedStatement.setTimestamp(4, new Timestamp(new Date().getTime()));*/
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next()){
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(SampleDateTest.converDateToString(rs.getTimestamp(4), "dd:mm:yyyy hh:mm"));
		}
	}

}
