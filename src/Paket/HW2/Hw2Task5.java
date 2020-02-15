package Paket.HW2;

public class Hw2Task5 {

    public static void main(String[] args) {

        int[] mas5 = {4, 5, 8, 45, 2, 15, 7, 0 , 1, 56, 54};
         int min = mas5[0];
        for (int i = 0; i < 11 ; i++) {
             if (mas5[i] < min) {
                min = mas5[i];            }
                    }
        System.out.println("min = " + min );

        int max = mas5[0];
        for (int i = 0; i < 11; i++) {
            if (mas5[i] > max){
                max = mas5[i];
            }
                   }
        System.out.println("max = " + max);
            }
}
