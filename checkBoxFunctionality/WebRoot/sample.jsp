<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Untitled Document</title>
		<script type="text/javascript" src="jquery-1.6.2.js">
</script>
		<script type="text/javascript" src="sample.js">
</script>
	</head>

	<body>
		<p>
			&nbsp;
		</p>
		Select Number of Adults::
		<select onchange="addAdult();" id="adultSelectBoxDiv">
			<option value="1">
				1 Adult
			</option>
			<option value="2">
				2 Adults
			</option>
			<option value="3">
				3 Adults
			</option>
		</select>
		Select Number of Childs::
		<select id="childSelectBoxDiv" onchange="addChild();">
			<option value="0">
				0 Child
			</option>
			<option value="1">
				1 Child
			</option>
			<option value="2">
				2 Childs
			</option>
			<option value="3">
				3 Childs
			</option>
			<option value="4">
				4 Childs
			</option>
		</select>

		<br />
		Existing traveles
		<br />
		<input type="checkbox" />
		penchal
		<input type="checkbox" />
		Prasanth

		<br />
		Adult 1:
		<br />
		First Name ::
		<input type="text" />
		Last Name ::
		<input type="text" />
		<div id="adultDiv"></div>
		<div id="childDiv"></div>
	</body>
</html>
