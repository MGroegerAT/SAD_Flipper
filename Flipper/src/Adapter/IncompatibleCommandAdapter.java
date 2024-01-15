package Adapter;

import Command.Command;
import Flipper.Flipper;

public class IncompatibleCommandAdapter implements Command {
    private IncompatibleCommand incompatibleCommand;

    public IncompatibleCommandAdapter(IncompatibleCommand incompatibleCommand) {
        this.incompatibleCommand = incompatibleCommand;
    }

    @Override
    public void execute(Flipper flipper) {
        // Hier können Sie den Code hinzufügen, um den inkompatiblen Befehl auszuführen
    }
}