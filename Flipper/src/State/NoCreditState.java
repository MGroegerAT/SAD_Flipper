package State;

import java.util.Scanner;
import Flipper.Flipper;

public class NoCreditState extends State {

    @Override
    public void insertCoin() {
if (Flipper.getFlipper().ballCount > 0) {
    Flipper.getFlipper().setState(new ReadyState());
    Flipper.getFlipper().play();
    System.out.println("\nTransition to ReadyState");
} else {
    System.out.println("Insert Coin y/n");
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine();
    if (input.equals("y")) {
        Flipper.getFlipper().ballCount = 3;
        System.out.println("\nTransition to ReadyState");
        Flipper.getFlipper().setState(new ReadyState());
        Flipper.getFlipper().play();

    } else {
        System.out.println("Ciao, bis zum nächsten mal");
        // You may want to add an exit mechanism here if needed
    }
}
        System.out.println("Insert Coin y/n");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        if (input.equals("y")) {
                Flipper.getFlipper().ballCount = 3;
                System.out.println("\nTransition to ReadyState");
                Flipper.getFlipper().setState(new ReadyState());
                Flipper.getFlipper().play();

        } else {
            System.out.println("Ciao, bis zum nächsten mal");
            // You may want to add an exit mechanism here if needed
        }
    }

    @Override
    public void pressStart() {
        // No operation in this state
    }
}
