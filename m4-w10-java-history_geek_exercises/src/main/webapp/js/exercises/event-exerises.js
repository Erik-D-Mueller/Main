/// <reference path="../jquery-3.1.1.js" />
// are JSTL and el included already since we have jquery?
// or can I not use jstl and jquery since this is not a jsp page?

$(document).ready(function(){

	
var sameAddressBox = $("#SameShipping");
sameAddressBox.click( function (event) {
	
	$("#ShippingAddress1").val(    $("#BillingAddress1").val()        );
	
	$("#ShippingAddress2").val(    $("#BillingAddress2").val()    );
	
	$("#ShippingCity").val(  $("#BillingCity").val()    );	
	
	$("#ShippingState").val(   $("#BillingState").val()    );
	
	$("#ShippingPostalCode").val(    $("#BillingPostalCode").val()  );
	
});	
	
$('input:radio[name="ShippingType"]').change(function() {
		
	var subtotal = parseFloat($("#subtotal").text().slice(11));
	
    

	


var shipping;
	switch($(this).val()){

		case "Standard":
		console.log("33");
		
		break;
		case "Express":
		console.log("express44");
		break;
		case "Two-Day":
		console.log("Two-day55");
		break;
		case "Overnight":
		console.log("Overnight66");

	}

});
	











var gameRestartButton=$("#btnRestart");
gameRestartButton.click(function(event){

	console.log(  "You clicked the restart button!"  );

});


// Is it good practice to put these variables out here?
// Does this stuff out here get loaded?
var row = 0;
var column=0;

var gameInput = document.getElementById("game");
gameInput.addEventListener("keyup", function(event){

	console.log("You keyed up! " + event.key)

if(event.key=="ArrowDown" && row<=8){
	row++;
 }
 if(event.key=="ArrowUp" && row>=1){
	row--;
 }
if(event.key=="LeftArrow" && column>=1){
	column--;
}
if(event.key=="RightArrow" && column<=8){
	column++;
}


var row = 2;
var column=3;

location = "#row_" + row + "_column_" + column;


$(location).addClass("ship");


var table = $("#gameboard")[0];

var cell = table.rows[2].cells[2];

var $cell = $(cell);

$(cell).addClass("ship");


});


});   // End of ready function