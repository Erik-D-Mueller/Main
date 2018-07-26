/// <reference path="../jquery-3.1.1.js" />




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
	
    console.log("7700");

	console.log($(this).datacost);


var shipping;
	switch($(this).val()){

		case "Standard":
		



		console.log(data-cost);
		break;
		case "Express":
		console.log("express900");
		break;
		case "Two-day":
		console.log("Two-day700");
		break;
		case "Overnight":
		console.log("Overnight700");

	}




	
	
	
	
});
	
	




});   // End of ready function