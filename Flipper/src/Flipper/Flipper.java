package Flipper;

import Flipper.Flipper;
import State.State;
import State.NoCreditState;
import Command.CommandTargetHit;
import Command.CommandBumperHit;
import Visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Flipper implements Visitable{

    private static Flipper instance;
    public State state;

    public List<Visitable> flipperElements = new ArrayList<>();

    public Flipper() {
        Target target = new Target();
        Bumper bumper = new Bumper();

        this.flipperElements.add(target);
        this.flipperElements.add(bumper);

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

    @Override
    public void accept(Visitor visitor) {
        for (Visitable flipperElements : flipperElements) {
            flipperElements.accept(visitor);
        }
        visitor.visit(this);
    }
}
