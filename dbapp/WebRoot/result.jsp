<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>


<html>
	<head>
		<script language="JavaScript" src="js/jquery-1.8.2.js"></script>
		<script type="text/javascript">
	$(document).ready(function() {// another way to write ready function
		$("#mainDivId").load("dburl");
	});// end of ready function	
	function addStudent(){
		$("#detailsId").load("manipulateStudent?x=ADD", function() {
			$("#updateButtonId").css("display", "none");
		});
	}
	function editStudent(){
		$("#detailsId").load("manipulateStudent?x=EDIT",$("#studentsFormId").serialize(), function() {
			$("#snoDivId").attr("readonly", "true");
			$("#saveButtonId").css("display", "none");
		});
	}
	function deleteStudent(){
		$.get("manipulateStudent?x=DELETE", $("#studentsFormId").serialize(), function() {
			$("#mainDivId").load("dburl");
		});
	}
		
</script>
	</head>
	<body>
		<div id="mainDivId"></div>
	</body>
</html>
