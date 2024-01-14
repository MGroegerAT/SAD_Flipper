package AbstractFactory;

public class AbstractFactoryANSIRegular implements AbstractFactory {
    private static AbstractFactoryANSIRegular instance;

    private AbstractFactoryANSIRegular() {
    }

    public static AbstractFactoryANSIRegular getInstance() {
        if (instance == null) {
            instance = new AbstractFactoryANSIRegular();
        }
        return instance;
    }

    @Override
    public String printASCIIPressStart() {
        return "\n" +
        "██████  ██████  ███████ ███████ ███████     ███████ ████████  █████  ██████  ████████ \n" +
        "██   ██ ██   ██ ██      ██      ██          ██         ██    ██   ██ ██   ██    ██    \n" +
        "██████  ██████  █████   ███████ ███████     ███████    ██    ███████ ██████     ██    \n" +
        "██      ██   ██ ██           ██      ██          ██    ██    ██   ██ ██   ██    ██    \n" +
        "██      ██   ██ ███████ ███████ ███████     ███████    ██    ██   ██ ██   ██    ██    \n";
    }

    @Override
    public String printASCIIGameOver() {
        return "\n" +
        " ██████   █████  ███    ███ ███████      ██████  ██    ██ ███████ ██████  \n" +
        "██       ██   ██ ████  ████ ██          ██    ██ ██    ██ ██      ██   ██ \n" +
        "██   ███ ███████ ██ ████ ██ █████       ██    ██ ██    ██ █████   ██████  \n" +
        "██    ██ ██   ██ ██  ██  ██ ██          ██    ██  ██  ██  ██      ██   ██ \n" +
        " ██████  ██   ██ ██      ██ ███████      ██████    ████   ███████ ██   ██ \n";
    }

    @Override
    public String printASCIIBall1() {
        return "\n" +
        "██████   █████  ██      ██           ██ \n" +
        "██   ██ ██   ██ ██      ██          ███ \n" +
        "██████  ███████ ██      ██           ██ \n" +
        "██   ██ ██   ██ ██      ██           ██ \n" +
        "██████  ██   ██ ███████ ███████      ██ \n";
    }

    @Override
    public String printASCIIBall2() {
        return "\n" +
        "██████   █████  ██      ██          ██████  \n" +
        "██   ██ ██   ██ ██      ██               ██ \n" +
        "██████  ███████ ██      ██           █████  \n" +
        "██   ██ ██   ██ ██      ██          ██      \n" +
        "██████  ██   ██ ███████ ███████     ███████ \n";
    }

    @Override
    public String printASCIIBall3() {
        return "\n" +
        "██████   █████  ██      ██          ██████  \n" +
        "██   ██ ██   ██ ██      ██               ██ \n" +
        "██████  ███████ ██      ██           █████  \n" +
        "██   ██ ██   ██ ██      ██               ██ \n" +
        "██████  ██   ██ ███████ ███████     ██████  \n";
    }




}
