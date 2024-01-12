package Flipper;

import Flipper.Flipper;
import State.State;
import State.NoCreditState;

public class Flipper {

    private static Flipper instance;
    public State state;

    private Flipper() {
        // Set initial state to NoCreditState
        this.state = new NoCreditState();
    }

    public static Flipper getFlipper() {
        if (instance == null) {
            instance = new Flipper();
        }
        return instance;
    }

    public void setState(State newState) {
        this.state = newState;
    }

    public void play() {
        state.pressStart();
    }

    public void insertCoin() {
        state.insertCoin();
    }
}
