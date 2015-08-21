<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body><center>
     <br>
     <br/>
    <s:form action="withDraw" theme="simple">
    <s:textfield name="accNo" cssStyle="display:none"></s:textfield>
    <table border="1" align="center"><tr><td valign="top">AMOUNT ::</td><td valign="top"><s:textfield name="balance"></s:textfield></td></tr>
    <tr><td colspan="2" align="center"><s:submit name="WITHDRAW" value="WITHDRAW"></s:submit></td></tr></table>
    </s:form></center>
  </body>
</html>
