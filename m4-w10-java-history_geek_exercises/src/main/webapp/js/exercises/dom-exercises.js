/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presidentialDivs() {
   $("#presidents div").addClass("president");
}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {
$("#george-washington").addClass("founding-father");
}

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {
$(".Republican").addClass("red");
}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {
    $(".Democratic").addClass("blue");
}

//Locate all Federalist presidents and add the 'gold' class.
function otherPresidents() {
$("Federalist").addClass("gold");
}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {
$("[id^=james]").addClass("James");
}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {


    // COuld it be .prev instead of .next?
$("#presidents h2").next().addClass("beginningOfCentury");

}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
    $("#presidents h2").prev().addClass("endOfCentury");
}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {
$("h2:contains('1900')").nextUntil("h2:contains('2000')").addClass("appearOnCurrency");


}