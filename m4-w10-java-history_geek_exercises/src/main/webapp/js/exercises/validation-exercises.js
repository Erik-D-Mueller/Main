/// <reference path="../jquery-3.1.1.js" />
/// <reference path="../jquery.validate.js" />

/* For form validation, we just import the validate library in the header,
 *and follow the below format, with inserting the name of the form and the name
 *of the fields that we want to enforce upon
 */

$(document).ready(function() {

	$("#form0").validate({ // registration form

		// The lecture code has this "debug" set to true, but for some reason
		// the buttons
		// stop working when I have it set to true. I don't know what the
		// significance is.

		debug : false,
		rules : {

			email : {

				email : true,
			},

			password : {
				required : true,
				minlength : 8,
				strongpassword : true

			},

			confirmPassword : {
				equalTo : "#password"

			},

		}, // end of debug-rules

		errorClass : "error",
		validClass : "valid"

	}); // end of .validate

	$("#checkout").validate({

		debug : false,
		rules : {

			
			
			ShippingType : {
				
			required: true,
	
			},
			
			BillingAddress1 : {
				
				required: true,
				
				
			},
			
			BillingAddress2: {
				
				required: true,
				
				
			},
			
			BillingCity : {
				
				required: true,
				
			},
			
			BillingState : {
				
				required : true,
				
				
			},
			
			BillingPostalCode : {
				
				required: true,
				
			},
			
			ShippingAddress1 : {
				
				required: true,
				
			},
			
			ShippingAddress2 : {
				
				required : true,
				
			},
			
			ShippingCity : {
				
				required : true,
			},
			
			ShippingState : {
				required: true,
				
			},
			
			ShippingPostalCode : {
				
				required: true,
				
			},
			
			NameOnCard : {
				required: true,
				
			},
			
			CreditCardNumber : {
				
				required: true,
			},
			
			ExpirationDate : {
				
				required : true,
				
			},
			
			

			
		}


	
	});
}); // end of DocumentReady
