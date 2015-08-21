<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
     <br>
<s:form action="getCustomer" theme="simple">
  Customer No:: <s:textfield name="id"></s:textfield>
  <s:submit></s:submit>
  </s:form>
  
  </body>
</html>
