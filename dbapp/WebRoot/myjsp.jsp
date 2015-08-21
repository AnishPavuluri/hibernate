<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<br/>
<body>
<table border="1">
<tr>
<td>student number ::</td><td><input id="snoDivId"  type="text" name="sno" value="<c:out value="${requestScope.s.studentNo}"/>"/></td></tr>
<tr><td>student name ::</td><td><input type="text" name="sname" value="<c:out value="${requestScope.s.studentName}"/>"/><br/></td></tr>
<tr><td>student address ::</td><td><input type="text" name="sadd" value="<c:out value="${requestScope.s.studentAddress}"/>"/><br/></td></tr>
<tr align="center"><td align="center"><input type="button" id="saveButtonId" value="SAVE" name="sr"/><input type="button" id="updateButtonId" value="UPDATE" name="sr"/></td></tr>
</table>

</body>
<script>

$("#saveButtonId").click(function(){
	//get is one of ajax method to make server call 1st argment is URL, second one is form data, 3rd one is callback function after executing action it will execute
	$.get("manipulateStudent?x=saveStudent",$("#studentsFormId").serialize(),function(){
		//load is another ajax method to make server call and response will be placed in given id i.e(mainDivId)
		$("#mainDivId").load("dburl");
	});
	
});
$("#updateButtonId").click(function(){
	//get is one of ajax method to make server call
	$.get("manipulateStudent?x=editStudent",$("#studentsFormId").serialize(), function(){
		//load is another ajax method to make server call and response will be placed in given id i.e(mainDivId)
		$("#mainDivId").load("dburl");
	});
	
});

</script>
</html>