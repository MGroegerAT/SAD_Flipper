package State;

import Flipper.Flipper;

import java.util.Scanner;

public class ReadyState extends State {

    @Override
    public void pressStart() {
        System.out.println("Credit: " + Flipper.getFlipper().ballCount);
        Flipper.getFlipper().ballCount -= 1;

            System.out.println("Start game? y/n");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("y")) {
                Flipper.getFlipper().setState(new PlayingState());
                Flipper.getFlipper().play(); // Automatically transition to PlayingState
        } else {
                Flipper.getFlipper().ballCount = 0;
                Flipper.getFlipper().setState(new NoCreditState());
                Flipper.getFlipper().insertCoin();


            }
    }

    @Override
    public void insertCoin() {
        // No operation in this state
    }
}
