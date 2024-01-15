package State;

import Flipper.Flipper;
import AbstractFactory.*;
import java.util.Scanner;

public class ReadyState extends State {

    private static AbstractFactory asciiText;
    @Override
    public void pressStart() {
        asciiText = AbstractFactoryANSIRegular.getInstance();
        switch (Flipper.getFlipper().ballCount) {
            case 1:
                System.out.println(asciiText.printASCIIBall1());
                break;
            case 2:
                System.out.println(asciiText.printASCIIBall2());
                break;
            case 3:
                System.out.println(asciiText.printASCIIBall3());
                break;
            default:
                System.out.println("ERROR ERROR ERROR ERROR ERROR ERROR");
        }

        Flipper.getFlipper().ballCount -= 1;
        System.out.println(asciiText.printASCIIPressStart());
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
