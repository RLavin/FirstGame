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
    static String Superhero = "";
    static String Ability = "";
    static int Ironlife = 0;
    static int Supermanlife = 0;
    static String Ironmanweapon = "";
    static String Supermanweapon = "";




    public static void main(String[] args) {

        System.out.println("Welcome to the greatest epic battle in the world!");
        System.out.println("Superman Vs. Ironman");
        System.out.println("Choose Your Player");
        System.out.println("Superman or Ironman?");

        // choose player name
        getAndPrintPlayerName();


        // chooose some abilities
        if (Superhero .equalsIgnoreCase(KEY_IRONMAN)) {
            System.out.println("Hello Ironman");
            System.out.println("You have a few abilities to battle your Opponent!");
            System.out.println("You have:");
            System.out.println("SonicBlaster");
            System.out.println("Missile Launchers");
            System.out.println("Flamethrowers");
            System.out.println("Jetboots");
            System.out.println("Jarvis");

        }

        if (Superhero .equalsIgnoreCase(KEY_SUPERMAN)) {
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


        if (Ability.equalsIgnoreCase(KEY_SONICBLASTER)) {
            System.out.println("SonicBlaster has a life points of 100");
             Ironlife = 100;
             Supermanweapon = KEY_IMMORTALITY;
        }

            if (Ability.equalsIgnoreCase(KEY_MISSILE_LAUNCHERS)) {
                System.out.println("Missile Launchers has a life points of 80");
                Ironlife = 80;
                Supermanweapon = KEY_X_RAY_VISION;
            }

            if (Ability.equalsIgnoreCase(KEY_FLAMETHROWERS)) {
                System.out.println("Flamethrowers has a life points of 60");
                Ironlife = 60;
                Supermanweapon = KEY_SUPER_SPEED;
            }

            if (Ability.equalsIgnoreCase(KEY_JETBOOTS)) {
                System.out.println("Jetboots has a life points of 40");
                Ironlife = 40;
                Supermanweapon = KEY_SUPER_STRENGTH;
            }

            if (Ability.equalsIgnoreCase(KEY_JARVIS)) {
                System.out.println("Jarvis has a life points of 20");
                Ironlife = 20;
                Supermanweapon = KEY_FLY;
            }

            if (Ability.equalsIgnoreCase(KEY_IMMORTALITY)) {
                System.out.println("Immortality has a life points of 100");
                Supermanlife = 100;
                Ironmanweapon = KEY_SONICBLASTER;
            }

            if (Ability.equalsIgnoreCase(KEY_X_RAY_VISION)) {
                System.out.println("X-ray Vision has a life points of 80");
                Supermanlife = 80;
                Ironmanweapon = KEY_MISSILE_LAUNCHERS;
            }

            if (Ability.equalsIgnoreCase(KEY_SUPER_SPEED)) {
                System.out.println("Super Speed has a life points of 60");
                Supermanlife = 60;
                Ironmanweapon = KEY_FLAMETHROWERS;
            }

            if (Ability.equalsIgnoreCase(KEY_SUPER_STRENGTH)) {
                System.out.println("Super Strength has a life points of 40");
                Supermanlife = 40;
                Ironmanweapon = KEY_JETBOOTS;
            }

            if (Ability.equalsIgnoreCase(KEY_FLY)) {
                System.out.println("Fly has a life points of 20");
                Supermanlife = 20;
                Ironmanweapon = KEY_JARVIS;

            }

        if (Superhero.equalsIgnoreCase(KEY_IRONMAN)) {
            Supermanlife  = Ironlife;
            System.out.println();
            System.out.println("Your player is Ironman!");
            System.out.println("Your health is " + Ironlife);
            System.out.println("Your ability is " + Ability);
            System.out.println("Your opponent is Superman!");
            System.out.println("Your opponent health is " + Supermanlife);
            System.out.println("Your opponent ability is " + Supermanweapon);

        }

        if (Superhero.equalsIgnoreCase(KEY_SUPERMAN)) {
            Ironlife = Supermanlife;
            System.out.println();
            System.out.println("Your player is Superman!");
            System.out.println("Your health is " + Supermanlife);
            System.out.println("Your ability is " + Ability);
            System.out.println("Your opponent is Ironman!");
            System.out.println("Your opponent health is " + Ironlife);
            System.out.println("Your opponent ability is " + Ironmanweapon);

        }



    }

    public static void getAndPrintPlayerName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your player name: ");
        Superhero  = reader.nextLine();
        System.out.println("You've selected: " + Superhero);
    }


    public static void getAndPrintAbilityName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ability to battle: ");
        Ability  = reader.nextLine();
        System.out.println("You've selected: " + Ability );

    }



}

