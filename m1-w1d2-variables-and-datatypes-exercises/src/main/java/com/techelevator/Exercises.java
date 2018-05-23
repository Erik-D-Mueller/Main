package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make code difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		
		int totalRacoons = 3;
		int racoonsThatGoToDinner = 2;
		int racoonsLeftInWoods = totalRacoons - racoonsThatGoToDinner;
		System.out.println(racoonsLeftInWoods);
		
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        
        */

		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int lessBeesThanFLowers = numberOfFlowers - numberOfBees;
		
		
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */

		int pigeonsInitiallyEatingBreadCrumbs = 1;
		int pigeonsThatCameLater = 1;
		int pigeonsEatingNow = pigeonsInitiallyEatingBreadCrumbs + pigeonsThatCameLater;
		
		
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */

		
		int initialOwls = 3;
		int owlsJoined = 2;
		int owlsOnFence = initialOwls + owlsJoined;
		
		
		
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */

		int initialBeavers = 2;
		int beaversLeftForSwim = 1;
		int beaversLeftWorking = initialBeavers - beaversLeftForSwim;
		
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */

		int initialToucans = 2;
		int toucansThatJoin = 1;
		int toucansInAll = initialToucans + toucansThatJoin;
		
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		
		int squirrelsInTree = 4;
		int nutsInTree = 2;
		int moreSquirrelsThanNuts = squirrelsInTree - nutsInTree;	
		
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */

		int quarter =1;
		int dime =1;
		int nickel =2;
		int money = quarter*(25) + dime*(10) + nickel*(5);
		
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		
		int muffinsFromBriersClass = 18;
		int muffinsFromMacAdamsClass = 20;
		int muffinsFromFlannerysClass = 17;
		int totalMuffins = muffinsFromBriersClass + muffinsFromMacAdamsClass + muffinsFromFlannerysClass;
		
		
		
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        
		int priceYoyo = 24;
		int priceWhistle = 14;
		int priceTotal = priceYoyo + priceWhistle;
		
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		
		
		
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        
		int inchesOfSnowHiltsHouse = 29;
		int inchesOfSnowBrecknock = 17;
		
		int moreSnowAtHiltsHouse = inchesOfSnowHiltsHouse - inchesOfSnowBrecknock;
				
		
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        
		int initialMoney = 10;
		int truckPrice = 3;
		int pencilPrice = 2;
		int moneyLeft = initialMoney - truckPrice - pencilPrice;
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        
		int initialMarbles = 16;
		int lostMarbles = 7;
		int marblesLeft = initialMarbles - lostMarbles;
		
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        
		int initialSeashells = 19;
		int desiredNumberSeashells = 25;
		int moreSeashellsNeeded = desiredNumberSeashells - initialSeashells;
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		
		int totallBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totallBalloons - redBalloons;
	
		
		
		
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        
		int initialBooks = 38;
		int addedBooks = 10;
		
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        
		int legsPerBee = 6;
		int numberOfBees = 8;
		int totalLegs = legsPerBee * numberOfBees;
		
		
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        
		double priceIceCream = 0.99;
		double numberOfCones = 2;
		double totalCost = priceIceCream * numberOfCones;
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        
		int initialRocks = 64;
		int numberOfRocksRequired = 125;
		int moreRocksNeeded = numberOfRocksRequired - initialRocks;
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        
		int initialMarbles = 38;
		int lostMarbles = 15;
		int marblesLeft = initialMarbles - lostMarbles;
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        
		int totalDistance = 78;
		int distanceBeforeStopping = 32;
		int milesLeftToDrive = totalDistance-distanceBeforeStopping;
		
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        
		int timeShovelingSaturdayMorning = 90;
		int timeShovelingSaturdayAfternoon = 45;
		int totalTimeShovelingSnow = timeShovelingSaturdayMorning + timeShovelingSaturdayAfternoon;
		
		
		
		
		
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
		double priceHotDog = 0.50;
		double numberHotDogsPurchased = 6;
		double totalPrice = priceHotDog * numberHotDogsPurchased;
		
		
		
		
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        
		double initialMoney = 0.50;
		double pencilPrice = 0.07;
		double numberOfPencilsSheCanBuy = initialMoney / pencilPrice;
		
		
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies - orangeButterflies;
	
		
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        
		double total = 1.00;
		double costCandy = 0.54;
		double change = total - costCandy;
		
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        
		int initialTrees = 13;
		int moreTreesPlanted = 12;
		int totalTrees = initialTrees + moreTreesPlanted;
		
		
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int daysTillSeesGrandma = 2;
		int hoursPerDay = 24;
		int totalHoursToSeeGrandma = daysTillSeesGrandma * hoursPerDay;
		
		
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        
		int numberOfCousins = 4;
		int gumPerCousin = 5;
		int totalGum = numberOfCousins * gumPerCousin;
		
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		
		double initialMoney = 3.00;
		double moneySpent = 1.00;
		double moneyLeft = initialMoney - moneySpent;
		
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        
		int boatsOnLake = 5;
		int peoplePerBoat = 3;
		int totalPeopleInBoats = boatsOnLake * peoplePerBoat;
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        
		long initialLegos = 380;
		long legosLost = 57;
		long legosLeft = initialLegos - legosLost;
	
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        
		int muffinsDesired = 38;
		int initialMuffins = 35;
		int moreMuffinsRequired = muffinsDesired - initialMuffins;
		
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int moreCrayonsWillyHasThanLucy = willysCrayons - lucysCrayons;
		
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        
		int stickersPerPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersPerPage * numberOfPages;
		
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        
		int totalCupcakes = 96;
		int totalChildren = 8;
		int cupcakesPerChildSharedEqually = totalCupcakes / totalChildren;
	
		
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        
		int totalGingerbreadCookies = 47;
		int cookiesPerJar = 6;
		double cookiesLeftOver = totalGingerbreadCookies % cookiesPerJar;
		
		
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        
		int croissantsPrepared = 59;
		int numberOfNeighbors = 8;
		int leftOverCroissants = croissantsPrepared - (croissantsPrepared % numberOfNeighbors);
		
		
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		
		int totalCookies = 276;
		int cookiesPerTray = 12;
		int traysNeeded = totalCookies / cookiesPerTray;
		
		
		
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        
		double pretzels = 480;
		double numberOfPretzelsInAServing = 12;
		double totalNumberOfServings = pretzels / numberOfPretzelsInAServing;
		
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        
		int numberOfCakesBaked = 53;
		int numberOfCakesLeftHome = 2;
		int numberOfCakesPerBox;
		int numberOfFullBoxes = (numberOfCakesBaked - numberOfCakesLeftHome) / numberOfCakesPerBox;
		
		/* Note that since numberOfFullBoxes is an int, it will "round down" and concatenate off the end" */
		
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        
		double carrotSticksPrepared = 74;
		double numberOfPeopleEquallyServed = 12;
		double carrotSticksLeftOver = carrotSticksPrepared % numberOfPeopleEquallyServed;	
		
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int totalBears = 98;
		int bearsPerShelf = 7;
		int shelvesFilled = totalBears / bearsPerShelf;	
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
      
		int totalPictures = 480;
		int picturesPerAlbum = 20;
		int albumsNeeded = Math.ceil( totalPictures / picturesPerAlbum );
		
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		
		int totalCards = 94;
		int cardsPerBox = 8;
		int boxesFilled = totalCards / cardsPerBox;
		/* It essentially rounds down since it cuts off everythig past the decimal point */
		
		int cardsInUnfilledBox = totalCards % cardsPerBox;		
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		double totalBooks = 210;
		double totalShelves = 10;
		double booksPerShelf = totalBooks / totalShelves;
		
		
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int croissantsBaked = 17;
		int guests =7;
		int croissantsPerGuest = croissantsBaked / guests;
		
		
		
        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

		double speedOfBill = ( (12*24)/2.15);   //feet per hour
		double speedOfJill = ( (12*24)/1.9); //feet per hour
		double totalSpeed = speedOfBill + speedOfJill;
		double totalArea = 5*(12*14);
		double timeRequired = totalArea / totalSpeed;
		double daysToPaint623Rooms = (623*(12*14) / totalSpeed ) / 8;
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle inital must end
        with a period.
        Example: "Hopper, Grace B." 
        */

		String firstName = "Erik";
		String lastName = "Mueller";
		String middleInitial = "D";
		String totalName = lastName + ", " + firstName + " " + middleInitial + ".";
		
		Sys.println(totalName);
		
		
		
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
 
		double distanceNYandChicago = 800;
		double distanceAlreadyTravelled = 537;
		double percentage = distanceAlreadyTravelled / distanceNYandChicago;
		
		
		
		
	}

}
