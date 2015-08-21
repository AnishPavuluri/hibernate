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
     <br/>
     <table border="0" cellpadding="5" cellspacing="5" align="center">
     <s:iterator var="mini" value="ministataements">
     <tr>
     <td width="200"><s:date format="dd/MM/yyyy HH:mm" name="transactionDate"/></td>
     <s:if test="%{transaction=='debit'}">
     	<td width="2" align="right">-</td>
     </s:if>
     <s:elseif test="%{transaction=='credit'}">
     	<td width="2" align="right">+</td>
     </s:elseif>
     <s:else><td width="2"></td></s:else>
     <td width="200"><s:property value="balance"/></td> 
     </tr>
     </s:iterator>
     <tr>
     <td>Available Balance ::</td>
     <td  colspan="2" align="right" width="67">
     	<s:property value="balance"/>
     </td>
     </tr>
     </table>
  </body>
</html>
