package Command;

import Flipper.Bumper;

public class CommandBumperHit implements Hit {

    private Bumper bumper;

    private CommandBumperHit (Bumper bumper) {
        this.bumper = bumper;
    }

    @Override
    public void execute() {
        bumper.bumperGetsHit();
    }
}
