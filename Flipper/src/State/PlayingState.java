package State;

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
        System.out.println("Flipper spielt");
        System.out.println("\nTransition back to NoCreditState");
        Flipper.getFlipper().setState(new NoCreditState());
        Flipper.getFlipper().insertCoin();
    }

    private void play() {
        Bumper bumper = new Bumper();
        Target target = new Target();

        target.targetGetsHit();
        bumper.bumperGetsHit();

        VisitorScore scoreVisitor = new VisitorScore();
        scoreVisitor.visit(bumper);
        scoreVisitor.visit(target);
        scoreVisitor.visit(Flipper.getFlipper());
    }
}
