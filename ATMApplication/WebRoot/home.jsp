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
   <br>
   <br>
   <table align="center" cellpadding="5" cellspacing="5">
   <tr>
   <td>
  
   <s:form action="balanceEnquiry">
   	<s:textfield name="accNo" cssStyle="display:none"></s:textfield>
   	<s:submit name="BALANCEENQUIRY" align="left" value="BALANCEENQUIRY"></s:submit>
   </s:form>
   </td>
  <td>
   <s:form action="ministatement">
   	<s:textfield name="accNo" cssStyle="display:none"></s:textfield>
   	<s:submit name="MINISTATEMENT" align="right" value="MINISTATEMENT"></s:submit>
   </s:form>
   </td></tr>
   <tr><td>
   <s:form action="amountWithDraw">
   	<s:textfield name="accNo" cssStyle="display:none"></s:textfield>
   	<s:submit name="CASHWITHDRAW" align="left" value="CASHWITHDRAW"></s:submit>
   </s:form>
   </td><td>
   <s:form action="transfer">
   	<s:textfield name="accNo" cssStyle="display:none"></s:textfield>
   	<s:submit name="FUNDSTRANSFER" align="right" value="FUNDSTRANSFER"></s:submit>
   </td></s:form>
   </tr>
    </table>
  </body>
</html>
