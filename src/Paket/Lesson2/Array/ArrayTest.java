package Paket.Lesson2.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        int[] data = new int [5];
        data[2] = 5;
        for (int value: data) {
            System.out.println(value);
            
        }
   String[] data2 = {"A", "B", "C", "D", "E"};
        //      int[] data2 = {6, 7, 8, 9, 10};
// int[] data2 = new int[] {6, 7, 8, 9, 11};
        for (String value : data2) {
            System.out.println(value);
                    }

        String[][] data3 = new String[3][3];
        data3[0][0] = "1";

        for (String[] row: data3) {
            for (String value: row) {
                System.out.println(value);
                
            }
            
        }

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        for (Integer value: list) {
            System.out.println(value);
        }
    }
}
