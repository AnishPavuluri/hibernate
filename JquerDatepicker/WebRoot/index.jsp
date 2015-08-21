 <!DOCTYPE html>
<html>
	<head>
		<link
			href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css"
			rel="stylesheet" type="text/css" />
		<script
			src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
</script>
		<script
			src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js">
</script>
<script type="text/javascript">
		
function days_between(date1, date2) {
	// The number of milliseconds in one day
	var ONE_DAY = 1000 * 60 * 60 * 24

	// Convert both dates to milliseconds
	var date1_ms = date1.getTime();
	var date2_ms = date2.getTime();
	// Calculate the difference in milliseconds
	var difference_ms = Math.abs(date1_ms - date2_ms);
    // Convert back to days and return
    return Math.round(difference_ms/ONE_DAY);

}
      



</script>


		<script>
$(document).ready(
		function() {
			$(function() {
				$("#fromDatepicker").datepicker();
			});
			$(function() {
				$("#todatepicker").datepicker();
			});

			$("#fromDatepicker,#todatepicker").change(
					function() {
						if ($("#fromDatepicker").val() != ''
								&& $("#todatepicker").val() != '') {
							var d1 = new Date($("#fromDatepicker").val());
							var d2 = new Date($("#todatepicker").val());
							var d = days_between(d1, d2);
							var wd;
							if(d>=7){
							var m = Math.floor(d/7);
							var r = d%7;
							wd = (d-(m*2))+r;
							}else{
								wd=d;
							}
							var day1 = (d1==0)?7:d1;
							var day2 = (d2==0)?7:d2;
							if(day1>=6){
									wd=wd-1;
								}if(day2>=6){
									wd=wd-1;
								}
							$("#diffDate").val(d);
							$("#workingDays").val(wd);
						}
					});
		});
</script>
		
	</head>
	<body style="font-size: 100%;">




		<p>
			From Date:
			<input type="text" id="fromDatepicker">
		</p>
		<p>
			To Date:
			<input type="text" id="todatepicker">
		</p>
		<p>Dates difference ::
		<input type="text" id="diffDate">
		</p>
		<p>
		Working days ::
		<input type="text" id="workingDays">
		</p>
	</body>
</html>