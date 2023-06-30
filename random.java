package Z1;


import java.util.Random;

public class random {
    public static int generateRandomIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt (max - min + 1) + min;
    }
}



