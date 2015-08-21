<html>
	<HEAD>
		<TITLE>Ajax Test Page</TITLE>
		<script type="text/javascript">

function register() {
	var req;
	if (window.XMLHttpRequest) {
		req = new XMLHttpRequest();
	} else if (window.ActiveXObject) {
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}

	var url = "Sample";
	req.onreadystatechange = function() {
		if (req.readyState == 4) {
			if (req.status == 200) {
				document.getElementById("register").innerHTML = req.responseText;
			}
		}
}
		req.open("GET", url, true);
		req.send();
	}

</script>
	</HEAD>

	<BODY>

		<a href="#" onclick="register();">Register</a>
		
		<button type="button" onclick="register();">
			Register
		</button>
		<div id="register">
		</div>
	</BODY>
</html>
