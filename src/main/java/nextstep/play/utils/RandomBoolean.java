package nextstep.play.utils;

import java.util.Random;

public class RandomBoolean {

    private static Random random = new Random();

    public static boolean generate() {
        return random.nextBoolean();
    }
}
