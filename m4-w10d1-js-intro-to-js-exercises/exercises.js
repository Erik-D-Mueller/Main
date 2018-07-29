function sumDouble(x,y){

    if(x==y){
        return 4*x;
    }
    return x + y;
}

function hasTeen(x,y,z){
    if(x >=13 && x<=19){return true;}
    if(y >=13 && y<=19){return true;}
    if(z >=13 && z<=19){return true;}
return false;
}

function lastDigit(x, y){
    xmod = x%10;
    ymod=y%10;
console.log(5);
    return (xmod===ymod)
}

function seeColor(input){
    if(input.slice(0,3)=="red"){return "red";}
    if(input.slice(0,4)=="blue"){return "blue";}
    return "";
}

function middleThree(input){

    length = input.length;
    half = (length/2 - ((length/2)%1))-1;
    return input.slice(half, half+3);

}

function frontAgain(input){

    front = input.slice(0,2);
    back = input.slice(input.length-2, input.length);

    if(front == back){ return true;}
    return false;

}

function alarmClock(dayValue, vacation){

switch(dayValue){
    case 0: 
    day = "Sunday";
    break;
    case 1:
    day = "Monday";
    break;
    case 2:
    day = "Tuesday";
    break;
    case 3:
    day = "Wednesday";
    break;
    case 4:
    day = "Thursday";
    break;
    case 5:
    day = "Friday";
    break;
    case 6:
    day = "Saturday";
    
    
    }

    if(vacation&&dayValue>=1&&dayValue<=5){
        output = day + " 10:00";
        return output;
    
    }
    if(vacation&&(dayValue==0||dayValue==6)){
        output = day + " off";
        return output;
    
    }
    if( dayValue>=1&&dayValue<=5){
        output = day + " 7:00";
        return output;
   
    }

        output=day + " 10:00";
        return output;
    }





    function makeMiddle(arrayInts){

        var arrayNew = [];
        
        if(arrayInts.length%2==0 && arrayInts.length>=2){
        length = arrayInts.length;
        half = ((length/2 - ((length/2)%1))-1);
        arrayNew[0] = arrayInts[half];
        arrayNew[1] = arrayInts[half+1];
        return arrayNew;
        }
        return arrayNew;
    }

    // This funciton works, except that the very last odd value always gets cut off, I don't know why, maybe loop related
    function oddOnly(inputArray){
        var newArray = [];

       var i;
        for(i=0; i < inputArray.length; i++){
            if(inputArray[i]%2!=0){
                newArray.push(inputArray[i]);
            }
        }
        return newArray; 
    }

    function weave(array1, array2){
        
        var outputArray = [];

        var i;
        for(i=0; i<Math.max(array1.length, array2.length); i++){
            
            if(i<array1.length){
            outputArray.push(array1[i]);
            }
            if(i<array2.length){
              outputArray.push(array2[i]);
            }
        }

    return outputArray;

    }


    function cigarParty(numCigars, isWeekend){

        if( isWeekend){

        if(numCigars >=40){ return true;}
        return false;
        }

        if(numCigars>=40 && numCigars <= 60){
            return true;
        }

        return false;

    }

    function stringSplosion(inputString){

        var outputString="";
        var tempString="";
        var counter1=1;
        var counter2=0;


        while(counter2<=inputString.length){
    
            counter2=1;
            
            tempString="";
            
            while(counter2 <= counter1 ){
            tempString = inputString.slice(0,counter2);
            counter2++;

            }
        outputString = outputString + tempString;
        counter1++;
        }

    return outputString;

    }

    function fizzBuzz(input){

    if(input%3==0 && input%5==0){return "FizzBuzz"};
    if(input%3==0){return "Fizz";}
    if(input%5==0){return "Buzz";}
    return input;

    }


      // Im skipping countValues because I
      // think theres an error in the code that tests it.
    function countValues(inputArray){

        var map = new Map();

        inputArray.forEach(function(number){


            if(!map.has(number)){

                map.set(number,1);
            }
            else{

                var temp = map.get(number) + 1;
                map.set(number, temp);
            }

        });

           return map;

    }

    function reverseArray(inputArray){

    var stack = new Array();

    var outputArray = new Array();

    inputArray.forEach(function(number){

        outputArray.unshift(number);

    });

    return outputArray;

    }