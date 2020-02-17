package Paket.Lesson2.Lesson3;

public class VarArgs {

    public static void main(String[] args) {

        System.out.println(sum(1,2, 3, 4, 7));
    }

    private static int sum(int firstValue, int... other) {
    //    private static int sum(int... other) {
        // int sum = 0;

        int sum = firstValue;
        for (int value : other) {
            sum += value;
            
        }
        return sum;

    }

}
