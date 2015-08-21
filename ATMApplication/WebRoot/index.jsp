<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
    <br>
    <table align="center" cellpadding="5" cellspacing="5" border="1">
    <s:form action="atmAction" theme="simple">
    <tr>
    <td valign="top">Enter AccNo ::</td><td valign="top"><s:textfield name="accNo"/></td></tr>
    <tr><td colspan="2" align="center"><s:submit name="CONTINUE"></s:submit></td></tr>
    </s:form>
    </table>
  </body>
</html>
