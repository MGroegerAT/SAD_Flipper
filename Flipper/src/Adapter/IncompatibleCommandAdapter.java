package Adapter;

import Command.Command;
import Flipper.Flipper;

public class IncompatibleCommandAdapter implements Command {
    private IncompatibleCommand incompatibleCommand;

    public IncompatibleCommandAdapter(IncompatibleCommand incompatibleCommand) {
        this.incompatibleCommand = incompatibleCommand;
    }

    @Override
    public void hit(Flipper flipper) {
        incompatibleCommand.incompatibleHit();
    }
}