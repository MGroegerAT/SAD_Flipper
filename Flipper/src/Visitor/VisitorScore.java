package Visitor;

import Flipper.Bumper;
import Flipper.Flipper;
import Flipper.Target;

public class VisitorScore implements Visitor {

    private static VisitorScore instance;
    private int score;

    public VisitorScore() {

    }

    public void resetScore() {
        score = 0;
    }


    public static VisitorScore getVisitorScore(){
        if(instance == null){
            instance = new VisitorScore();
        }
        return instance;
    }

    public void visit(Bumper bumper) {
        score += bumper.getBumperHits();
    }

    public void visit(Target target) {
        score += target.getTargetHits();
    }

    public void visit(Flipper flipper) {
        System.out.println("Score: " + score);
    }
}
