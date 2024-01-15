package State;

import java.util.Random;

import Flipper.*;
import Mediator.HitRandomMediator;
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
        Flipper.getFlipper().setState(new NoCreditState());
        Flipper.getFlipper().insertCoin();
    }

    private void play() {
        System.out.println("Playing game...");
        Bumper bumper = new Bumper();
        Target target = new Target();


        HitRandomMediator mediator = new HitRandomMediator(bumper, target);

        mediator.flipperElementHitSequence();

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
