import java.util.Scanner;

public class HeroApplication {

    public static void main(String[] args) {

        // Variable initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String realName;
        String universe;

        // Variable assignment
        heroName = "DogoMom";
        heroCity = "Riga";
        heroPower1 = "Lightning speed reaction";
        heroPower2 = "Reads dog minds";
        heroPower3 = " ";
        isEvil = false;
        heroSalary = 99.99;
        realName = "Liza";
        universe = "Our";

        // Print out Hero information card
        System.out.println("***********************");
        System.out.println("*** HERO INFO ***");
        System.out.println("***********************");

        System.out.println("Hero name: " + heroName);
        System.out.println("Hero lives in : " + heroCity);

        System.out.println("-----------------------");
        System.out.println("Hero Superpowers:");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);

        System.out.println("This super hero is evil? " + isEvil);

        System.out.println("This hero earns: " + heroSalary + " EUR ");
        System.out.println(heroName + " hides her identity.");
        System.out.println("Hero lives in " + universe + " Universe ");

        System.out.println("***********************");
        System.out.println("*** HERO INFO ***");
        System.out.println("***********************");


        //How many cookies can a superhero purchase for her salary
        // 1 cookie costs = 1.29 euro

        System.out.println("***********************");
        System.out.println("*** FINANCIALS ***");
        System.out.println("***********************");
        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
        System.out.println("Hero can purchase " + numOfCookies + " cookies");

        double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
        System.out.println("Hero's average daily salary is " + averageDailySalary + " euro");

        //If a hero is a villain or a hero
        if (isEvil) {
            System.out.println("Hero is a villain. He is stealing cookies!");
        } else {
            System.out.println("The hero protects the city!");
        }

        heroCity = "Metropolis";

        switch (heroCity) {
            case "New York":
                heroSalary = 2000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 100;
        }

        // Task 2 - Superhero salary calculation
        System.out.println("---- HERO SALARY PER DAY BY HOURLY RATES ----");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the amount of hours the Hero works a day: ");
        int workingHoursInDay = scanner.nextInt();

        if (workingHoursInDay<0 || workingHoursInDay>24) {
            System.out.println("There can only be 24 hours in a day. Make sure you input the correct number.");
        } else if (workingHoursInDay<=8) {
            System.out.println("The hero salary is: " + workingHoursInDay * 10 + " Eur a day");
        } else if (workingHoursInDay>8) {
            System.out.println("The hero salary is: " + (80 + (workingHoursInDay-8)*15) + " Eur a day");
        }


    }
}
