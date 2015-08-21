<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<body>
		<br>
		<s:form action="saveMarks" theme="simple">
			<s:iterator value="questions" var="q" status="index1">
			<s:textfield name="answearForms[%{#index1.index}].questionId" value="%{#q.id}" cssStyle="display:none"></s:textfield>
				<s:property value="#index1.count" />) <s:property value="#q.name" />
				<br />

				<s:if test="%{#q.type.equalsIgnoreCase('M')}">
					<s:checkboxlist
						name="answearForms[%{#index1.index}].answearsByUser"
						list="answears" listKey="id" listValue="name"></s:checkboxlist>
					<br />
				</s:if>
				<s:else>
					<s:radio name="answearForms[%{#index1.index}].answearsByUser"
						list="answears" listKey="id" listValue="name"></s:radio>
					<br />
				</s:else>
			</s:iterator>
			<s:textfield name="studentName" value="%{studentName}" cssStyle="display:none"></s:textfield>
			<s:submit></s:submit>
		</s:form>
	</body>
</html>
