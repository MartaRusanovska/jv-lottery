package core.basesyntax;

import java.util.Random;

public class Lottery {
    Random random = new Random();
    private static final int CONSTANT = 101;
    public Ball getRandomBall() {
        int value = random.nextInt(CONSTANT);
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Ball(colorSupplier.getRandomColor(), value);
    }
}
