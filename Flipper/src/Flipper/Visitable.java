package Flipper;

import Visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
