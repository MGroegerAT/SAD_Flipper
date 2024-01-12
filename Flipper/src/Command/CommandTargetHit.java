package Command;

import Flipper.Target;

public class CommandTargetHit  implements Hit {

    private Target target;

    private CommandTargetHit(Target target) {
        this.target = target;
    }
    @Override
    public void execute() {
    }
}
