// JavaScript Document
function addAdult(){
	//input:checked
	//input[id^=adultCheckBox
	//to uncheck the checked select box
	if("input:checked"){
	$("input[id^=adultCheckBox]").each(function(n) {
		alert("n-->"+n);
		$(this).attr('checked', false);
	});
	}
	//to remove data from first fields
	$('#adultFirstName0').val("");
	$('#adultLastName0').val("");
	
	var a = $("#adultSelectBoxDiv").val();
	$("#adultDiv").empty();
	if(a != 1){
		for(var i = 1;i<a; i++){
		 $("#adultDiv").append('<br/>Adult '+i+1+':<br />First Name ::<input type="text"  id="adultFirstName'+i+'"/>Passenger Type ::<input type="text" id="adultLastName'+i+'"/><br/>');
		}                                                                     
	}
}

function addChild(){
	//to uncheck checked check boxes
	if("input:checked"){
	$("input[id^=childCheckBox]").each(function(n) {
		$(this).attr('checked', false);
	});
	}
	var a = $("#childSelectBoxDiv").val();
	$("#childDiv").empty();
	if(a != 0){
		
		for(var i = 1;i<=a; i++){
		 $("#childDiv").append('<br/>Child '+i+':<br />First Name ::<input type="text" id="childFirstName'+i+'"/>Passenger Type ::<input type="text" id="childLastName'+i+'"/><br/>');
		}
	}
}

function addDataToPassengerFields(idx,pasType,data){
	var total = $('#'+pasType+'SelectBoxDiv').val();
	var t = $('#'+pasType+"CheckBox"+idx).is(':checked');
	var emptyField;
	if(total>0){
	if(t){
		var d = data.split(";");
		for(var i=0;i<total;i++){
			if(($('#'+pasType+'FirstName'+i).val()=="") && ($('#'+pasType+'FirstName'+i).val()=="")){
				$('#'+pasType+'FirstName'+i).val(d[0]);
				$('#'+pasType+'LastName'+i).val(d[1]);
				emptyField = i;
				$('#'+pasType+'CheckBoxHidden'+idx).val(i);
				$('#messageDivId').text(pasType+" added successfully");
				break;
			}
		}
		if(emptyField == undefined){
				$('#messageDivId').text(pasType+" travelr exced");
				return false;
			}
	}else{
		var dataToDelete = $('#'+pasType+'CheckBoxHidden'+idx).val(); 
		$('#'+pasType+'FirstName'+dataToDelete).val("");
		$('#'+pasType+'LastName'+dataToDelete).val("");
	}
	}else{
		$('#messageDivId').text(pasType+" not selected");
		return false;
	}
}
	