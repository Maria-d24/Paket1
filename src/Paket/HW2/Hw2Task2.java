package Paket.HW2;

public class Hw2Task2 {

    public static void main(String[] args) {
        int[] mas2 = new int[8];
        mas2[0] = 0;
        System.out.println("mas2[0] = " + mas2[0]);
        for (int i = 1; i < 8; i++) {
           // mas2[0] = 0;
            mas2[i] = mas2[i-1] + 3;
            System.out.println("mas2[" + i + "] = " + mas2[i]);

        }
    }
}
