<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    
  <body>
     <br><center>
     <s:form action="login" theme="simple">
     UserName :: <s:textfield name="userName"></s:textfield><br/>
     Password :: <s:textfield name="password"></s:textfield><br/>
     <s:submit></s:submit>
     </s:form>
     </center>
  </body>
</html>
