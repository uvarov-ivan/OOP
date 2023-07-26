package DIP;

public class EngineCar {
    private iEngine engine;

    public EngineCar(iEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

