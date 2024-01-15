import AbstractFactory.AbstractFactory;
import AbstractFactory.AbstractFactoryANSIRegular;
import AbstractFactory.AbstractFactoryStandard;
import Flipper.Flipper;


public class Main {
    private static AbstractFactory asciiText;
    public static void main(String[] args) {

       // printText();

        Flipper flipper = Flipper.getFlipper();
        flipper.insertCoin();

    }



    private static void printText() {
        String text;

        //ANSI Regular-Schrift
        asciiText = AbstractFactoryANSIRegular.getInstance();

        text = asciiText.printASCIIPressStart();
        System.out.println(text);

        text = asciiText.printASCIIBall1();
        System.out.println(text);

        text = asciiText.printASCIIBall2();
        System.out.println(text);

        text = asciiText.printASCIIBall3();
        System.out.println(text);

        text = asciiText.printASCIIGameOver();
        System.out.println(text);

        
        //Standard-Schrift
        asciiText = AbstractFactoryStandard.getInstance();

        text = asciiText.printASCIIPressStart();
        System.out.println(text);

        text = asciiText.printASCIIBall1();
        System.out.println(text);

        text = asciiText.printASCIIBall2();
        System.out.println(text);

        text = asciiText.printASCIIBall3();
        System.out.println(text);

        text = asciiText.printASCIIGameOver();
        System.out.println(text);

    }



}