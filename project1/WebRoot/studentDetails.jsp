<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
	<form id="searchForm">
		<center>
			Student
			<select name="selectName">
				<option>
					Select Name
				</option>
				<option value="studentName">
					Name
				</option>
				<option value="studentMarks">
					Marks
				</option>
			</select>
			<input type="text" name="nameMarks"/>
			<input type="button" name="search" value="search"
				onclick="searchStudent();">
		</center>

		<table align="center" border="1">
			<tr>
				<th>
					Student No
				</th>
				<th>
					Student Name
				</th>
				<th>
					Marks
				</th>
			</tr>
			<c:forEach items="${requestScope.students}" var="s">
				<tr>
					<td>
						<c:out value="${s.studentNumber}"></c:out>

					</td>
					<td>
						<c:out value="${s.name}"></c:out>
					</td>
					<td>
						<c:out value="${s.marks}"></c:out>
					</td>
				</tr>

			</c:forEach>
		</table>
	</form>
</html>