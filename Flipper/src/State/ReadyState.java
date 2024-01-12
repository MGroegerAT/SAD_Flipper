package State;

import Flipper.Flipper;

import java.util.Scanner;

public class ReadyState extends State {

    @Override
    public void pressStart() {
        System.out.println("Start game? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println("\nTransition to PlayingState");
            Flipper.getFlipper().setState(new PlayingState());
            Flipper.getFlipper().play(); // Automatically transition to PlayingState
        } else {
            System.out.println("Ciao, bis zum nächsten mal");
            // You may want to add an exit mechanism here if needed
        }
    }

    @Override
    public void insertCoin() {
        // No operation in this state
    }
}
