package Paket.HW2;

public class Hw2Task1 {

    public static void main(String[] args) {
      //  int[] mas = new int[10];
        int[] mas1 = {1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < 10; i++) {
            if (mas1[i] ==1) {
                mas1[i] = 0; }
                  else { mas1[i] = 1;}

                  System.out.println("mas1[" + i + "] = " + mas1[i]);
        }
    }
}
