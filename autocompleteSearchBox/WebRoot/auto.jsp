<%@ page import="java.sql.*"%>
<%
	String name = request.getParameter("name").toString();
	String buffer = "<div>";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs = st
				.executeQuery("select * from data where name like '"
						+ name + "%'");
		while (rs.next()) {
			buffer = buffer + rs.getString("name") + "<br>";
		}
		buffer = buffer + "</div>";
		response.getWriter().println(buffer);
	} catch (Exception e) {
		System.out.println(e);
	}
%>
