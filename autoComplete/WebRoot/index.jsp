<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <SCRIPT type="text/javascript" src="js/jquery-1.7.2.min.js"></SCRIPT>
  <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script>
  <link href="css/jquery-ui-1.8.20.custom.css" rel="stylesheet" type="text/css"></link>
	<script type="text/javascript">
/*idleTime = 0;
$(document).ready(function () {
    //Increment the idle time counter every minute.
    var idleInterval = setInterval("timerIncrement()", 60000); // 1 minute

    //Zero the idle timer on mouse movement.
    $(this).mousemove(function (e) {
        idleTime = 0;
    });
    $(this).keypress(function (e) {
        idleTime = 0;
    });
})
function timerIncrement() {
    idleTime = idleTime + 1;
    if (idleTime > 1) { // 20 minutes
    	alert("hai");
        window.location.reload();
    }
}*/
</script>
  
	 
  <script type="text/javascript">
  $(function() {
		$( "#nameId" ).autocomplete({
			source: function( request, response ) {
				$.getJSON("autoComplete",$('#sampleForm').serialize(),function( data ) {
				console.log(data);
						response($.map( data, function( item ) {
						console.log("item-->"+item);
							return {
								label: item,value: item
							}
						}));
					}
				);
			},
			minLength: 1,
			select: function( event, ui ) {
				/*log( ui.item ?
					"Selected: " + ui.item.label :
					"Nothing selected, input was " + this.value);*/
					if(ui.item.label=="rama"){
						ui.item.value = "";
					}
			},
			open: function() {
				$( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
			},
			close: function() {
				$( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
			}
		});
	});
  
  </script>
    
  </head>
  <s:form id="sampleForm" theme="simple">
  <body>
    <br>
    Name ::<s:textfield name="name" id="nameId"></s:textfield>
  </body>
  </s:form>
</html>
