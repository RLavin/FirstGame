import java.util.Scanner;

/**
 * Created by Raul on 9/9/16.
 */
public class SupermanVsIronman {
    static String KEY_SUPERMAN = "Superman";
    static String KEY_IRONMAN = "Ironman";
    static String KEY_JARVIS = "Jarvis";
    static String choice = "";


    public static void main(String[] args) {

        System.out.println("Lets play a game");
        System.out.println("Choose Your Player");
        System.out.println("Superman or Ironman?");

        // choose player name
        getAndPrintPlayerName();


        // chooose some abilities
        if(choice.equalsIgnoreCase(KEY_IRONMAN)){
            System.out.println("Hello Ironman");
            System.out.println("You have a few abilities to battle your Opponent!");
            System.out.println("You have:");
            System.out.println("SonicBlaster");
            System.out.println("Missile Launchers");
            System.out.println("Flamethrowers");
            System.out.println("Jetboots");
            System.out.println("Jarvis");

        }

        if(choice.equalsIgnoreCase(KEY_SUPERMAN)){
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




       if(choice.equalsIgnoreCase(KEY_JARVIS)) {
           System.out.println("Jarvis has a life points of 50");
       }

    }

    public static void getAndPrintPlayerName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your player name: ");
        choice = reader.nextLine();
        System.out.println("You've selected: " + choice);}


    public static void getAndPrintAbilityName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your ability to battle: ");
        choice = reader.nextLine();
        System.out.println("You've selected: " + choice);

    }



}

