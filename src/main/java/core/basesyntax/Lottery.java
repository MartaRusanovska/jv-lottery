package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int value = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String getRandomColor = colorSupplier.getRandomColor();
        return new Ball(getRandomColor, value);
    }
}
