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
    }
}
