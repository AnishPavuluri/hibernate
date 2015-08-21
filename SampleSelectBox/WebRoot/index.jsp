<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript">
function myFunction()
{
alert("hai");
$.ajax({url : "selectBoxAction",
		data : $("studentForm").serialize(),
		success : function(output) {
				$("#sortedResults").html(output);
			}
		});
	
}

</script>
</head>
  <body>
  <s:form name="studentForm" id="studentForm" theme="simple">
     <s:select list="studentNos" name="studentNo" onchange="myFunction()" id="studentNo"></s:select>
  </s:form>
  <div id="sortedResults"></div>
  </body>
</html>
