import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {

    // Function to add x in arr
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

        //VARIABLES
        String[] heroList = {"DogoMom", "AliExpressMan", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowFlake", "MuffinGirl", "STAR"};

        // MENU
            // 1. I would like to see a MENU to select different parts of superhero information card
            // 2. A list of superheroes
            // 3. Add new superhero
            // 4. show specific superhero information
            // 5. Delete the superhero from the list
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

                    System.out.println("Hero name: " + heroList[superHeroIndex]);

                    //add an array on top for salaries (double), powers, real name, etc, and every other variable we have!
                    //and from that print the info here.. with loops

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
                    System.out.println("************ HERO INFO ************");
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


//        heroCity = "Metropolis";
//
//        switch (heroCity) {
//            case "New York":
//                heroSalary = 2000;
//                break;
//            case "Riga":
//                heroSalary = 1200.91;
//                break;
//            case "Metropolis":
//                heroSalary = 1000000;
//                break;
//            default:
//                heroSalary = 100;
//        }

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
