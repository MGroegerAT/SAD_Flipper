package Adapter;

import Flipper.Visitable;
import Visitor.Visitor;

public class IncompatibleElementAdapter implements Visitable {
    private IncompatibleElement incompatibleElement;

    public IncompatibleElementAdapter(IncompatibleElement incompatibleElement) {
        this.incompatibleElement = incompatibleElement;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(incompatibleElement);
    }
}