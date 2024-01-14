package State;

import java.util.Random;

import Flipper.*;
import Visitor.Visitor;
import Visitor.VisitorScore;
public class PlayingState extends State {



public PlayingState() {


    this.play();
}

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void pressStart() {
        System.out.println("Playing game...");
        System.out.println("\nTransition back to NoCreditState");
        Flipper.getFlipper().setState(new NoCreditState());
        Flipper.getFlipper().insertCoin();
    }

    private void play() {
        Bumper bumper = new Bumper();
        Target target = new Target();


        target.targetGetsHit(randomNumberOfHits());
        bumper.bumperGetsHit(randomNumberOfHits());

        VisitorScore scoreVisitor = new VisitorScore();
        scoreVisitor.visit(bumper);
        scoreVisitor.visit(target);
        scoreVisitor.visit(Flipper.getFlipper());
    }

    private int randomNumberOfHits() {
    Random random = new Random();
    return random.nextInt(50);
    }
}
