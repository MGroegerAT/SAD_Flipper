package State;

import Flipper.Flipper;
public class PlayingState extends State {



    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void pressStart() {
        System.out.println("Flipper spielt");
        System.out.println("\nTransition back to NoCreditState");
        Flipper.getFlipper().setState(new NoCreditState());
        Flipper.getFlipper().insertCoin();
    }
}
