<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Untitled Document</title>
		<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript" src="js/sample.js"></script>
	</head>
	<body>
	<s:form id="travelsForm" theme="simple">
		<p>&nbsp; 
		</p>
		Select Number of Adults::
		<s:select list="#{'2':'2 Adult','3':'3 Adult'}" onchange="addAdult();" id="adultSelectBoxDiv" headerKey="1" headerValue="1 Adult"/>
			
		Select Number of Childs::
		<s:select id="childSelectBoxDiv" onchange="addChild();" list="#{'1':'1 Child','2':'2 Childs','3':'3 Childs'}" headerKey="0" headerValue="0 child"/>
			
		<br /><br/>
		Existing traveles ::
		<br />
		<s:set name="travelerIndex" value="0"></s:set>
		<s:iterator id="traveler" value="travelers" status="idx">
		<s:set name="travelerData" value="#traveler.travelerName.concat(';').concat(#traveler.passengerType)"></s:set>
		<s:if test="#idx.index == 0"></s:if>
		<s:else>
		<s:set name="previousIndex" value="#idx.index - 1"></s:set>
			<s:if test="#traveler.passengerType.equals(travelers[#previousIndex].passengerType)">
				<s:set name="travelerIndex" value="#travelerIndex+1"></s:set>
			</s:if>
			<s:else>
				<s:set name="travelerIndex">0</s:set>
			</s:else>
			
		</s:else>
		<s:set name="divId" value="#traveler.passengerType.concat('CheckBox').concat(#travelerIndex)"></s:set>
		<s:hidden id="%{#traveler.passengerType}CheckBoxHidden%{#travelerIndex}" name="data[{#idx.index}]"></s:hidden>
		<s:checkbox name="%{#divId}" id="%{#divId}" onclick='javascript:return addDataToPassengerFields("%{#travelerIndex}","%{#traveler.passengerType}","%{#travelerData}")' />
		<s:property value="#traveler.travelerName"/>
		</s:iterator>
		<br/>
		<div id="messageDivId"></div>
		Adult 1:
		<br />
		First Name ::
		<s:textfield  id="adultFirstName0"/>
		Passenger Type ::
		<s:textfield id="adultLastName0"/>
		<s:div id="adultDiv"></s:div>
		<s:div id="childDiv"></s:div>
		</s:form>
	</body>
</html>
