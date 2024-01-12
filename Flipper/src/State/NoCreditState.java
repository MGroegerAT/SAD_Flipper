package State;

import java.util.Scanner;
import Flipper.Flipper;

public class NoCreditState extends State {

    @Override
    public void insertCoin() {
        System.out.println("Insert Coin y/n");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        if (input.equals("y")) {
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
