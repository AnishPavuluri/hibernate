// JavaScript Document
function addAdult(){
	var a = $("#adultSelectBoxDiv").val();
	$("#adultDiv").empty();
	if(a != 1){
		for(var i = 2;i<=a; i++){
		 $("#adultDiv").append('<br/>Adult '+i+':<br />First Name ::<input type="text" />Last Name ::<input type="text" /><br/>');
		}
	}
}

function addChild(){
	var a = $("#childSelectBoxDiv").val();
	$("#childDiv").empty();
	if(a != 0){
		
		for(var i = 1;i<=a; i++){
		 $("#childDiv").append('<br/>Child '+i+':<br />First Name ::<input type="text" />Last Name ::<input type="text"/><br/>');
		}
	}
}
	