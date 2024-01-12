package Visitor;

import Flipper.*;

public interface Visitor {
    void visit(Flipper flipper);
    void visit(Target target);
    void visit(Bumper bumper);
}
