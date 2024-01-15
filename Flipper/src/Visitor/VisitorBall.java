package Visitor;

import Flipper.*;

import java.util.List;
import java.util.Random;

public class VisitorBall implements Visitor {

    @Override
    public void visit(Flipper flipper) {

    }

    @Override
    public void visit(Bumper bumper) {
        bumper.bumperGetsHit(1);
    }




    @Override
    public void visit(Target target) {
        target.targetGetsHit(1);
    }

}
