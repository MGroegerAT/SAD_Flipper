package Flipper;
import Visitor.*;

public class Target implements Visitable {

    public int hits;

    public int getTargetHits() {
        return hits;
    }

    public void targetGetsHit() {

        hits += 2;
        VisitorScore scoreVisitor = VisitorScore.getVisitorScore();
        this.accept(scoreVisitor);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

