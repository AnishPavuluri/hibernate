<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
     <br>
     <s:form action="loginUser">
     USER NAME ::<s:textfield name="user.userName"/>
     PASSWORD ::<s:password name="user.password"/>
     <s:submit name="LOGIN" value="LOGIN"/>
     </s:form>
  </body>
</html>
