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
		<br />
		
			<s:form action="fundsTransfer" theme="simple">
			<table align="center" border="1">
				<s:textfield name="accNo" cssStyle="display:none"></s:textfield>
				<tr>
					<td valign="top">
						TO ACCOUNT ::
					</td>
					<td valign="top">
						<s:textfield name="toAccNo"></s:textfield>
					</td>
				</tr>
				<tr>
					<td valign="top">
						AMOUNT ::
					</td>
					<td valign="top">
						<s:textfield name="balance"></s:textfield>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<s:submit value="TRANSFER"></s:submit>
					</td>
				</tr>
				</table>
			</s:form>
		
	</body>
</html>
