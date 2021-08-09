import java.util.*;

public class HeroApplication {

    // Function to add a hero in the array
    public static String[] addX(String heroArray[], String newHeroName)
    {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));
        // Add the new element
        arrlist.add(newHeroName);
        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array BY INDEX
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        heroArray = Arrays.copyOf(heroArray, heroArray.length - 1);

        // return the array
        return heroArray;
    }

    public static void main(String[] args) {

        //*************************************NEW PART CREATED AFTER OOP PRESENTATION**********************************

        System.out.println();
        //Adding info for hero A
        Hero a = new Hero(101, "DogoMom", "Riga", "Our Universe", 3050.90d, 55);
        System.out.println("HERO A: " + a);

        //Printing the level of hero A
        System.out.println("HERO A IS LEVEL " + a.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero b = new Hero(202, "SuperWoman", "Riga", "Our Universe", 5060.45d, 19);
        System.out.println("HERO B: " + b);

        //Printing hero info using getter
        System.out.println("HERONAME OF HERO B: " + b.getHeroName());

        //Printing the level of hero B
        System.out.println("HERO B IS LEVEL " + b.calculatedLevel());
        System.out.println();


        //Adding a new hero
        Hero c = new Hero(303, "LandShark", "Riga", "Unknown Universe", 300.15, 15);
        System.out.println("HERO C: " + c);
        System.out.println();


        //3. TASK. Create a new array Metropole with the type hero and put all created objects in it.
        Hero[] Metropole = {a, b, c};

        //Find out how many heroes are with level 1 in the Metropole with loop
        int counter = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("Number of LEVEL 1 heroes in Metropole is: " + counter);


        //Find out how many heroes are with the level which is larger than 1 in the Metropole
        int counter2 = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].calculatedLevel() > 1) {
                counter2++;
            }
        }
        System.out.println("Number of heroes in Metropole with level LARGER than 1 is:  " + counter2);


        //Find out if there is any hero with the name “John”
        int countJohn = 0;
        for (int i = 0; i < Metropole.length; i++) {
            if (Metropole[i].getHeroName().equalsIgnoreCase("John")) {
                countJohn++;
            }
        }
        System.out.println("Number of Metropole HEROES named John is: " + countJohn);
        System.out.println();


//        //4. BONUS TASK
//        //Using Scanner class, ask for input of all heroes values in the console and create the new hero in the system.
//        //Add it in the Metropole array.
//        System.out.println("----------------------------USER INPUT HERO-------------------------------");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please input the heroID: ");
//        int userInputHeroID = scanner.nextInt();
//
//        System.out.println("Please input the Name: ");
//        String userInputName = scanner.next();
//
//        System.out.println("Please input the Surname: ");
//        String userInputSurname = scanner.next();
//
//        System.out.println("Please input the Hero Name: ");
//        String userInputHeroName = scanner.next();
//
//        System.out.println("Please input the Hero City: ");
//        String userInputHeroCity = scanner.next();
//
//        System.out.println("Please input the Hero Universe: ");
//        String userInputUniverse = scanner.next();
//
//        System.out.println("Is this hero a Villain or a Hero?: ");
//        HeroType userInputHeroType = HeroType.valueOf(scanner.next());
//
//        System.out.println("Please input the Hero Salary: ");
//        double userInputHeroSalary = scanner.nextDouble();
//
//        System.out.println("Please input the Deed Time: ");
//        int userInputDeedTime = scanner.nextInt();
//
//        Hero d = new Hero (userInputHeroID, userInputName, userInputSurname, userInputHeroName, userInputHeroCity, userInputUniverse + " Universe", userInputHeroType, userInputHeroSalary, userInputDeedTime);
//        System.out.println("HERO D: " + d);
//        System.out.println();
//
//        //NOT COMPLETED - ADD THE NEW HERO (d) TO METROPOLE ARRAY


        //DISTRICT SAMPLE HOMEWORK: TASK 1 DAY 17

        //create seven heroes
        Hero hero1 = new Hero(404, "Sugar", "LightCity", "This Universe",  956.55, 103);
        Hero hero2 = new Hero(505, "DanMan", "LightCity", "This Universe", 303, 3);
        Hero hero3 = new Hero(606, "BeesKnee", "LightCity", "This Universe", 999.3, 45);

        Hero hero4 = new Hero(707, "DrDoom", "DarkCity", "This Universe", 2633, 35);
        Hero hero5 = new Hero(808, "Gloom", "DarkCity", "This Universe", 155, 18);
        Hero hero6 = new Hero(909, "Boom", "DarkCity", "This Universe", 672.61, 3);
        Hero hero7 = new Hero(919, "SharpHands", "DarkCity", "This Universe", 1003.5, 9);

        //Create two districts
        //Add three heroes in the first District and others in the second District.
        District district1 = new District();
        district1.setTitle("District99");
        district1.setCity("LightCity");
        district1.setDistrictID(99);
        district1.addNewHero(hero1);
        district1.addNewHero(hero2);
        district1.addNewHero(hero3);

        District district2 = new District();
        district2.setTitle("District33");
        district2.setCity("DarkCity");
        district2.setDistrictID(33);
        district2.addNewHero(hero4);
        district2.addNewHero(hero5);
        district2.addNewHero(hero6);
        district2.addNewHero(hero7);


        //Print out all information about each District.
        System.out.println("Information on DISTRICT 1: " + district1);
        System.out.println("Information on DISTRICT 2: " + district2);
        System.out.println();

        //Remove one hero from the second District.
        district2.removeHero(3);


        //e. Calculate (and print) average level of each District.
        System.out.println("Average District Level in DISTRICT 1: " + district1.calculateAvgLevelInDistrict());
        System.out.println("Average District Level in DISTRICT 2: " + district2.calculateAvgLevelInDistrict());
        System.out.println();

        //g. Create an arraylist of the Districts and put both District objects in the arraylist.
        ArrayList<District> districts = new ArrayList<>();
        districts.add(district1);
        districts.add(district2);
        System.out.println("Information on the DISTRICT array: " + districts);



        //h. Calculate how many heroes are in both Districts.
        System.out.println("Number of heroes in DISTRICT 1: " + district1.heroesInTheDistrict.size());
        System.out.println("Number of heroes in DISTRICT 2: " + district2.heroesInTheDistrict.size());
        System.out.println();


        //j. Find out which District is the best based on the average level of heroes.
        if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("DISTRICT 1 is better than District 2!");
        } else if (district1.calculateAvgLevelInDistrict() > district2.calculateAvgLevelInDistrict()) {
            System.out.println("DISTRICT 2 is better than District 1!");
        } else if (district1.calculateAvgLevelInDistrict() == district2.calculateAvgLevelInDistrict()) {
            System.out.println("BOTH districts are equally good!");
        } else {
            System.out.println("There seems to be an error..");
        }
        System.out.println();


        //k. Delete the first District. What’s happening with heroes in there?
        //




        //HOMEWORK DAY 18. TASK 1

        //a. Create seven Heroes as the objects.
        Hero hero11 = new Hero(4040,"Sugar", "LightCity", "This Universe", 956.55, 103);
        Hero hero12 = new Hero(5050,"DanMan", "LightCity", "This Universe", 303, 3);
        Hero hero13 = new Hero(6060,"BeesKnee", "LightCity", "This Universe", 999.3, 45);
        Hero hero14 = new Hero(7070,"DrDoom", "LightCity", "This Universe", 2633, 35);
        Hero hero15 = new Hero(8080,"Gloom", "LightCity", "This Universe", 155, 18);
        Hero hero16 = new Hero(9090,"Boom", "LightCity", "This Universe", 672.61, 3);
        Hero hero17 = new Hero(9191,"SharpHands", "LightCity", "This Universe", 1003.5, 9);

        //a. Create two Districts as the objects.
        District districtA18 = new District();
        districtA18.setTitle("DistrictA18");
        districtA18.setCity("LightCity");
        districtA18.setDistrictID(118);

        District districtB18 = new District();
        districtB18.setTitle("DistrictB18");
        districtB18.setCity("BadCity");
        districtB18.setDistrictID(811);

        //a. Create three Villains as the objects.
        Villain villain1 = new Villain(001, "BadSam", "DarkCity", "Bad Universe", 1000, 666);
        villain1.setName("Sam");
        villain1.setSurname("Worst");

        Villain villain2 = new Villain(002, "DrStorm", "DarkCity", "Bad Universe", 2687.64, 53);
        Villain villain3 = new Villain(003, "JavaBug", "DarkCity", "Bad Universe", 55, 35);


        //b. Add three Heroes in the first District
        districtA18.addNewHero(hero11);
        districtA18.addNewHero(hero12);
        districtA18.addNewHero(hero13);
        //b. Add others in the second District
        districtB18.addNewHero(hero14);
        districtB18.addNewHero(hero15);
        districtB18.addNewHero(hero16);
        districtB18.addNewHero(hero17);



        //c. Print out all information about each District.
        System.out.println("Information about DISTRICT A18: " + districtA18);
        System.out.println("Information about DISTRICT B18: " + districtB18);
        System.out.println();


        //d. Print out information about all Villains.
        System.out.println("Info about the Villains: " + "\n" + villain1 + "\n" + villain2 + "\n" + villain3);
        System.out.println();


        //e.  Create an arraylist for Villains storing. Put all Villains in it.
        ArrayList<Villain> villains = new ArrayList<>();
        villains.add(villain1);
        villains.add(villain2);
        villains.add(villain3);
        System.out.println("Information on the VILLAIN array: " + villains);
        System.out.println();


        //f. Find out the total number (total time) of the crimes in which the Villains were involved.
        System.out.println("VILLAIN 1 has committed approximately: " + villain1.totalCrimes() + " crime/s");
        System.out.println("VILLAIN 2 has committed approximately: " + villain2.totalCrimes() + " crime/s");
        System.out.println("VILLAIN 3 has committed approximately: " + villain3.totalCrimes() + " crime/s");
        System.out.println();


        //g. Find out which Villain is involved in the most crimes (max time spent).
        //???













        //PREVIOUS WORK WITH MENU***************************************************************************************
        System.out.println();
        System.out.println("----------------------MAIN WORK DONE EARLIER IN THE COURSE-------------------------------");

        //VARIABLES
        String[] heroList = {"DogoMom", "AliExpressMan", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowFlake", "MuffinGirl", "STAR"};

        //Adding arrays for other variables to bring out specific hero info in menu item 3
        String[] heroCityList = {"Riga", "Liepaja", "Talsi", "Rujiena", "Rezekne"};
        double[] heroSalaryList = {3050.99, 2950.55, 1260.40, 4100.15, 3010.77};
        String[] realNameList = {"Liza", "Laura", "Karina", "Tatjana", "Romans"};



        // MENU
            // -- I would like to see a MENU to select different parts of superhero information card
            // 1. A list of superheroes
            // 2. Add new superhero
            // 3. show specific superhero information
            // 4. Delete the superhero from the list
            // 0. Exit


        int menuEntry;
        Scanner scannerTwo = new Scanner(System.in);

        do {
            //EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do: ");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero!");
            System.out.println("0 - Exit");
            menuEntry = scannerTwo.nextInt();

            switch ( menuEntry ) {
                case 1:
                    System.out.println("================= SUPERHERO LIST ================");
                    for (String heroName: heroList
                         ) {
                        System.out.println(heroName);
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Enter the hero's name: ");
                    String newHeroName = scannerTwo.next();
                    heroList = addX(heroList, newHeroName);
                    break;
                case 3:
                    //Using if or switch functions show specific hero information
                    System.out.println("Which superhero info to print? Enter an index from the list! ");
                    int superHeroIndex = scannerTwo.nextInt();

                    System.out.println("================= SUPERHERO INFO ================");
                    System.out.println("Hero name: " + heroList[superHeroIndex]);
                    System.out.println("Hero city: " + heroCityList[superHeroIndex]);
                    System.out.println("Hero salary: " + heroSalaryList[superHeroIndex] + " EUR");
                    System.out.println("Hero real name: " + realNameList[superHeroIndex]);
                    System.out.println("================= SUPERHERO INFO ================");
                    System.out.println();

                    //-----------------------------------------------------------------------------------------------//


                    // Variable initialization
                    String heroName;
                    String heroCity;
                    boolean isEvil;
                    double heroSalary;
                    String realName;
                    String universe;

                    // Variable assignment
                    heroName = "DogoMom";
                    heroCity = "Riga";

                    //ADDED AN ARRAY (21.07.21)
                    String[] powersArray = {"Lightning speed reaction", "Reads dog minds", "Master cuddler"};

                    isEvil = false;
                    heroSalary = 3050.99;
                    realName = "Liza";
                    universe = "Our";


                    // Print out Hero information card
                    System.out.println();
                    System.out.println("***********************************");
                    System.out.println("********* FULL HERO INFO **********");
                    System.out.println("***********************************");

                    System.out.println();
                    System.out.println("Hero name: " + heroName);
                    System.out.println("Hero lives in: " + heroCity);

                    System.out.println();

                    //ADDED A FOR LOOP (21.07.21)
                    System.out.println("HERO SUPERPOWERS:");
                    for (int i = 0; i < powersArray.length; i++) {
                        System.out.println(powersArray[i]);
                    }


                    System.out.println();
                    if (isEvil) {
                        System.out.println("This super hero is A VILLAIN!");
                    } else {
                        System.out.println("This super hero is not a villain!");
                    }

                    System.out.println();
                    System.out.println(heroName + " hides their true identity.");
                    System.out.println("This hero lives in " + universe + " Universe ");

                    System.out.println();
                    System.out.println("This hero earns: " + heroSalary + " EUR a month");
                    System.out.println();


                    //How many cookies can a superhero purchase for her salary
                    // 1 cookie costs = 1.29 euro

                    System.out.println("***********************************");
                    System.out.println("********* HERO FINANCIALS *********");
                    System.out.println("***********************************");
                    System.out.println();

                    int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println("This hero can purchase " + numOfCookies + " cookies with their monthly salary.");

                    double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100d;
                    System.out.println("Hero's average daily salary is " + averageDailySalary + " euro.");
                    System.out.println();



                    // Task 2 - Superhero salary calculation
                    System.out.println("---- CALCULATE HERO SALARY PER DAY BY HOURLY RATES ----");

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please insert the amount of hours the Hero works a day: ");
                    int workingHoursInDay = scanner.nextInt();

                    if (workingHoursInDay < 0 || workingHoursInDay > 24) {
                        System.out.println("There can only be 24 hours in a day. Make sure you input the correct number.");
                    } else if (workingHoursInDay <= 8) {
                        System.out.println("This hero will earn: " + workingHoursInDay * 10 + " Eur a day");
                    } else if (workingHoursInDay > 8) {
                        System.out.println("This hero will earn: " + (80 + (workingHoursInDay - 8) * 15) + " Eur a day");
                    }


                    // Class assignment (SuperHero application - work evaluation grades)
                    // 14.07.21
                    System.out.println();
                    System.out.println("***********************************");
                    System.out.println("******** HERO REPORT CARD *********");
                    System.out.println("***********************************");
                    System.out.println();

                    System.out.println("Please type in your work evaluation grade (A-G) in ALL CAPS: ");
                    char deedGrade = scanner.next().charAt(0);

                    switch (deedGrade) {
                        case 'A':
                        case 'B':
                            System.out.println("Perfect! You are so brave!");
                            break;
                        case 'C':
                            System.out.println("Good! But You can do better!");
                            break;
                        case 'D':
                        case 'E':
                            System.out.println("It is not good! You should choose your bad or good side!");
                            break;
                        case 'F':
                            System.out.println("Bad, are you even trying to be good?");
                            break;
                        case 'G':
                            System.out.println("Bad, you are a true villain!");
                            break;
                        default:
                            System.out.println("A grade you tried to input does not exist!");

                    }

                    //-----------------------------------------------------------------------------------------------//

                    break;
                case 4:
                    System.out.println("Please enter the name of hero you want to delete: ");

                    int heroIndexToDelete = scannerTwo.nextInt();
                    heroList = removeX(heroList, heroIndexToDelete);

                    for (String hero : heroList) {
                        System.out.println(hero);
                    }
                    break;
                default:
                    System.out.println("Menu item does not exist");
            }

        } while(menuEntry != 0);






    }
}
