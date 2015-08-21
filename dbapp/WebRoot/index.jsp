<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body><center>
   <h3>
					Students Details
				</h3>
				<br>
				<form id="studentsFormId">
					<table border="1" width="338" height="90">
						<tr>
							<th colspan="2">
								S_NO
							</th>
							<th>
								S_NAME
							</th>
							<th>
								S_ADDRESS
							</th>
						</tr>

						<c:forEach items="${requestScope.studentList}" var="s">
							<tr>
								<td>
									<input type="radio" name="sno" value="<c:out value="${s.studentNo}"/>"/>
								</td>
								<td>
									<c:out value="${s.studentNo}" />
								</td>
								<td>
									<c:out value="${s.studentName}" />
								</td>
								<td>
									<c:out value="${s.studentAddress}" />
								</td>
							</tr>
						</c:forEach>
					</table>
					<br />
					<input id="addButtonId" type="button" name="x" value="ADD" onclick="addStudent()"/>
					<input id="editButtonId" type="button" name="x" value="EDIT" onclick="editStudent()"/>
					<input id="deleteId" type="button" name="x" value="DELETE" onclick="deleteStudent()"/>
					<br/><br/>
					<div id="detailsId"></div>
					<center>
  </body>
</html>
