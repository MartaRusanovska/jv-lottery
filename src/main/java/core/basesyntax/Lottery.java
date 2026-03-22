package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int CONSTANT = 101;
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public Ball getRandomBall() {
        int value = random.nextInt(CONSTANT);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
