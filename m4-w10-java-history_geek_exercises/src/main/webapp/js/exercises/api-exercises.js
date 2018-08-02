/// <reference path="../jquery-3.1.1.js" />
$(document).ready(function () {

	// Once they select a radiobox for shipping amount
	$('input:radio[name="ShippingType"]').change(function() {
		
		// Are the variables from the event Js page within
		// scope?  Do  I need to calculate these things again?
		
		var mySubtotal = $("#subtotal").text().slice(11);
		
		var zip = $("#ShippingPostalCode").val();
		
		console.log(mySubtotal +  "   "  + zip);

		var apiUrl = "http://localhost:8080/m4-java-historygeek-exercises/api/getTax/";
		
		$.ajax({
			
			data: {billingZipCode: zip, subtotal: mySubtotal},
			url: apiUrl,
            type: "GET",
            dataType: "json"
            	
        }).done(function (data) {
        	
		   var tax = data.taxTotal;
		   
		   $("#tax span").text("$" + tax);
		   console.log(mySubtotal +  "   "  + zip + "  " + tax);

        }).fail(function (xhr, status, error) {
            console.log(error);
        });
	
	});
	
});