import java.util.Scanner;

/**
 * Created by Raul on 9/9/16.
 */
public class SupermanVsIronman {
    static String KEY_SUPERMAN = "Superman";
    static String KEY_IRONMAN = "Ironman";
    static String KEY_SONICBLASTER = "SonicBlaster";
    static String KEY_MISSILE_LAUNCHERS = "Missile Launchers";
    static String KEY_FLAMETHROWERS = "Flamethrowers";
    static String KEY_JETBOOTS = "Jetboots";
    static String KEY_JARVIS = "Jarvis";
    static String KEY_IMMORTALITY = "Immortality";
    static String KEY_X_RAY_VISION = "X-ray Vision";
    static String KEY_SUPER_SPEED = "Super Speed";
    static String KEY_SUPER_STRENGTH = "Super Strength";
    static String KEY_FLY = "Fly";
    static String choice = "";


    public static void main(String[] args) {

        System.out.println("Welcome to the greatest epic battle in the world!");
        System.out.println("Superman Vs. Ironman");
        System.out.println("Choose Your Player");
        System.out.println("Superman or Ironman?");

        // choose player name
        getAndPrintPlayerName();


        // chooose some abilities
        if (choice.equalsIgnoreCase(KEY_IRONMAN)) {
            System.out.println("Hello Ironman");
            System.out.println("You have a few abilities to battle your Opponent!");
            System.out.println("You have:");
            System.out.println("SonicBlaster");
            System.out.println("Missile Launchers");
            System.out.println("Flamethrowers");
            System.out.println("Jetboots");
            System.out.println("Jarvis");

        }

        if (choice.equalsIgnoreCase(KEY_SUPERMAN)) {
            System.out.println("Hello Superman");
            System.out.println("You have a few abilities to battle your Opponent!");
            System.out.println("You have:");
            System.out.println("X-ray Vision");
            System.out.println("Super Speed");
            System.out.println("Super Strength");
            System.out.println("Fly");
            System.out.println("Immortality");


        }

        getAndPrintAbilityName();


        if (choice.equalsIgnoreCase(KEY_SONICBLASTER)) {
            System.out.println("SonicBlaster has a life points of 100");
        }

            if (choice.equalsIgnoreCase(KEY_MISSILE_LAUNCHERS)) {
                System.out.println("Missile Launchers has a life points of 80");
            }

            if (choice.equalsIgnoreCase(KEY_FLAMETHROWERS)) {
                System.out.println("Flamethrowers has a life points of 60");
            }

            if (choice.equalsIgnoreCase(KEY_JETBOOTS)) {
                System.out.println("Jetboots has a life points of 40");
            }

            if (choice.equalsIgnoreCase(KEY_JARVIS)) {
                System.out.println("Jarvis has a life points of 20");
            }

            if (choice.equalsIgnoreCase(KEY_IMMORTALITY)) {
                System.out.println("Immortality has a life points of 100");
            }

            if (choice.equalsIgnoreCase(KEY_X_RAY_VISION)) {
                System.out.println("X-ray Vision has a life points of 80");
            }

            if (choice.equalsIgnoreCase(KEY_SUPER_SPEED)) {
                System.out.println("Super Speed has a life points of 60");
            }

            if (choice.equalsIgnoreCase(KEY_SUPER_STRENGTH)) {
                System.out.println("Super Strength has a life points of 40");
            }

            if (choice.equalsIgnoreCase(KEY_FLY)) {
                System.out.println("Fly has a life points of 20");
            }

        if (choice.equalsIgnoreCase(KEY_IRONMAN)) {
            System.out.println("Your now ready to battle your opponent Superman!");
        }


    }

    public static void getAndPrintPlayerName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your player name: ");
        choice = reader.nextLine();
        System.out.println("You've selected: " + choice);
    }


    public static void getAndPrintAbilityName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ability to battle: ");
        choice = reader.nextLine();
        System.out.println("You've selected: " + choice);

    }



}

