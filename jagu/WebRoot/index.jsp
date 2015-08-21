<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<script type="text/javascript" src="jquery.js">
</script>
		<script type="text/javascript">
/*$(document).ready(function() {
	$("#sortButton").click(function() {
		$.ajax({
			url : "sortServlet",
			data : $("#textData").serialize(),
			success : function(output) {
			alert(data);
				$("#sortedResults").html(output);
			}
		});
	});
});*/
$(document).ready(function(){

  $("#sortButton").click(function(){
    $ ("#sortedResults").load("sortServlet",$("#textData").serialize());
  });
});
</script>
	</head>

	<body>
		<center>
			<br>
			<form id="textData">
				Text to Sort ::
				<textarea rows="5" cols="50" name="sampleText"></textarea>
				<br />
				<br />
				Character Position ::
				<input type="text" name="char" />
				<br />
				<br />
			<a href="#" id="sortButton">
				<input type="button" name="SORT" value="SORT" />
			</a>
			</form>
			<div id="sortedResults" style="color: red;"></div>
		</center>
	</body>
</html>
