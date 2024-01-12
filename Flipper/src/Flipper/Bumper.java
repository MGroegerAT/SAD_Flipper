package Flipper;
import Visitor.*;


public class Bumper implements Visitable {

    public int hits;

    public int getBumperHits() {
        return hits;
    }

    public void bumperGetsHit() {
        hits += 1;
        VisitorScore scoreVisitor = VisitorScore.getVisitorScore();
        this.accept(scoreVisitor);
    }

    @Override
    public void accept(Visitor visitor) {
visitor.visit(this);
    }
}
