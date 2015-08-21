<html>
<head>
<script language="JavaScript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		console.log("hello");
		$("#studentDetailsDiv").load("StudentDetailsServlet");		
	});
	function searchStudent(){
	$("#search").load("SearchServlet",$("#serchForm").serialize());
	}
	</script>
</head>
<div id="studentDetailsDiv"></div>
</html>