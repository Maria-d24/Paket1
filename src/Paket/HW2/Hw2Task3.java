package Paket.HW2;

public class Hw2Task3 {

    public static void main(String[] args) {

        int[] mas3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (mas3[i] < 6) {
                mas3[i] = mas3[i]*2;
            }
           System.out.println("mas3[" + i + "] = " + mas3[i]);
        }


    }
}
