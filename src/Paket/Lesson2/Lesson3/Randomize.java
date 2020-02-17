package Paket.Lesson2.Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Randomize {

    public static void main(String[] args) {

        int[] mas0 = new  int[5];
        Random random = new Random();

        for (int i = 0; i < mas0.length ; i++) {
            mas0[i] = random.nextInt(10);
                    }
        System.out.println(Arrays.toString(mas0));

    }
}
