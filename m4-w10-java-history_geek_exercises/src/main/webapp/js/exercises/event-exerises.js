/// <reference path="../jquery-3.1.1.js" />
// are JSTL and el included already since we have jquery?
// or can I not use jstl and jquery since this is not a jsp page?

$(document).ready(function() {

	var sameAddressBox = $("#SameShipping");
	sameAddressBox.click(function(event) {

		$("#ShippingAddress1").val($("#BillingAddress1").val());

		$("#ShippingAddress2").val($("#BillingAddress2").val());

		$("#ShippingCity").val($("#BillingCity").val());

		$("#ShippingState").val($("#BillingState").val());

		$("#ShippingPostalCode").val($("#BillingPostalCode").val());

	});

	$('input:radio[name="ShippingType"]').change(function() {

		var subtotal = parseFloat($("#subtotal").text().slice(11));

		var shippingAmount = parseFloat($(this).attr("data-cost"));

		grandTotal = subtotal + shippingAmount;

		var grandTotal = grandTotal.toFixed(2).toString();

		$("#shipping span").text("$" + $(this).attr("data-cost"));

		$("#grandtotal span").text("$" + grandTotal);

	});

	var gameRestartButton = $("#btnRestart");
	gameRestartButton.click(function(event) {

		console.log("You clicked the restart button!");

	});

	// Is it good practice to put these variables out here?
	// Does this stuff out here get loaded?
	
	var row = 0;
	var column = 0;
	var prevRow = 0;
	var prevColumn = 0;
	
	var gameInput = document.getElementById("game");
	gameInput.on("keyup", function(event) {

		keyPushed = event.key;

		console.log("You pressed a key! " + keyPushed)

		if (keyPushed === "ArrowDown" && row <= 8) {
			
			prevRow = row;
			prevColumn = column;
			row++;
		}
		if (keyPushed === "ArrowUp" && row >= 1) {
			prevRow = row;
			prevColumn = column;
			row--;
		}

		if (keyPushed ==="ArrowLeft" && column >= 1) {
			prevColumn = column;
			prevRow = row;
			column--;
		}
		if (keyPushed === "ArrowRight" && column <= 8) {
			
			prevColumn = column;
			prevRow = row;
			column++;
			
		}

		

		var prevCoords = "#row_" + prevRow + "_column_" + prevColumn;
	
		var coords = "#row_" + row + "_column_" + column;

		$(prevCoords).removeClass("ship");

		$(coords).addClass("ship");

	});

}); // End of ready function
