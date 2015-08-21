<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html>
  <head>
  <!--<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>-->
  <script type="text/javascript" src="http://code.jquery.com/jquery-git2.js"></script>
  
  <script type="text/javascript">
 	$(document).ready(function() {
 	$('select option:eq(0)').css('display','none');
 		alert(jQuery('select > option').size());
  		$('select').click(function(){
  				
  		});
  		$('select').change(function(){
  			alert('hai');
  			$('select').val('');	
  		});
    });
  </script>
  </head>  
  <body>
       
     <br><center>
     <s:form action="login.action" theme="simple">
     UserName :: <s:textfield name="userName"></s:textfield><br/>
     Password :: <s:textfield name="password"></s:textfield><br/>
     <select id="selectBoxId">
     <option value="">select</option>
     <option value="1">1</option>
     <option value="2">2</option>
     <option value="3">3</option>
     <option value="4">4</option>
     </select>
     </s:form>
     </center>
  </body>
</html>
