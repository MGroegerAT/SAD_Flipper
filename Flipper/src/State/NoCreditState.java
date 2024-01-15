package State;

import java.util.Scanner;
import Flipper.Flipper;
import AbstractFactory.*;

public class NoCreditState extends State {

    private static AbstractFactory asciiText;
    @Override
    public void insertCoin() {

        asciiText = AbstractFactoryANSIRegular.getInstance();

if (Flipper.getFlipper().ballCount > 0 && Flipper.getFlipper().ballCount != 999) {
    Flipper.getFlipper().setState(new ReadyState());
    Flipper.getFlipper().play();
} else {
    if (Flipper.getFlipper().ballCount != 999) {
        System.out.println(asciiText.printASCIIGameOver());
    }
    System.out.println("\nStart new Game?");
    System.out.println("Insert Coin y/n");
    Scanner scn = new Scanner(System.in);
    String input = scn.nextLine();
    if (input.equals("y")) {
        Flipper.getFlipper().ballCount = 3;
        Flipper.getFlipper().setState(new ReadyState());
        Flipper.getFlipper().play();

    } else {
        System.out.println("Thank you for playing, bye bye");
        // You may want to add an exit mechanism here if needed
    }
}

    }

    @Override
    public void pressStart() {
        // No operation in this state
    }
}
