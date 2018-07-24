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
        console.log(day + " 10:00");
    return;
    }
    if(vacation&&(dayValue==1||dayValue==6)){
        console.log(day + " off");
    return;
    }
    if( dayValue>=1&&dayValue<=5){
        console.log(day + " 7:00");
   return;
    }

console.log(day + " 10:00");
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

       
        return newArray; for(var num in inputArray){
            if(num%2!=0){
                newArray.push(num);
            }
        }

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
        var counter1=1;

        while(counter2<=inputString.length){
            
            var counter2=1;
            while(counter2 <= counter1 ){
           
            outputString = outputString + inputString.slice(0,counter2);
            counter2++;

            }

        counter1++;
        }

    return outputString;

    }
