package AbstractFactory;

public class AbstractFactoryStandard implements AbstractFactory {
    private static AbstractFactoryStandard instance;

    private AbstractFactoryStandard() {
    }

    public static AbstractFactoryStandard getInstance() {
        if (instance == null) {
            instance = new AbstractFactoryStandard();
        }
        return instance;
    }

    @Override
    public String printASCIIPressStart() {
        return "\n" +
        "  ____                      ____  _             _   \n" +
        " |  _ \\ _ __ ___  ___ ___  / ___|| |_ __ _ _ __| |_ \n" +
        " | |_) | '__/ _ \\/ __/ __| \\___ \\| __/ _` | '__| __|\n" +
        " |  __/| | |  __/\\__ \\__ \\  ___) | || (_| | |  | |_ \n" +
        " |_|   |_|  \\___||___/___/ |____/ \\__\\__,_|_|   \\__|\n";
    }

    @Override
    public String printASCIIGameOver() {
        return "\n" +
        "   ____                         ___                 \n" +
        "  / ___| __ _ _ __ ___   ___   / _ \\__   _____ _ __ \n" +
        " | |  _ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|\n" +
        " | |_| | (_| | | | | | |  __/ | |_| |\\ V /  __/ |   \n" +
        "  \\____|\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_|   \n";
    }

    @Override
    public String printASCIIBall1() {
        return "\n" +
        "  ____        _ _   _ \n" +
        " | __ )  __ _| | | / |\n" +
        " |  _ \\ / _` | | | | |\n" +
        " | |_) | (_| | | | | |\n" +
        " |____/ \\__,_|_|_| |_|\n";
    }

    @Override
    public String printASCIIBall2() {
        return "\n" +
        "  ____        _ _   ____  \n" +
        " | __ )  __ _| | | |___ \\ \n" +
        " |  _ \\ / _` | | |   __) |\n" +
        " | |_) | (_| | | |  / __/ \n" +
        " |____/ \\__,_|_|_| |_____|\n";
    }

    @Override
    public String printASCIIBall3() {
        return "\n" +
        "  ____        _ _   _____ \n" +
        " | __ )  __ _| | | |___ / \n" +
        " |  _ \\ / _` | | |   |_ \\ \n" +
        " | |_) | (_| | | |  ___) |\n" +
        " |____/ \\__,_|_|_| |____/ \n";
    }




}
