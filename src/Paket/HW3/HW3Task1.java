package Paket.HW3;

import java.util.Random;
import java.util.Scanner;

public class HW3Task1 {



        public static void main(String[] args) {


            // int ch = new int;
         //   int p;
            do {
                Random random1 = new Random();// ввод юзером числа, потом проверка на совпадение с рандомным ,
            int b = random1.nextInt(9);                     // которое от нуля до девяти


            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9: ");
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();

                if (b == a) {
                    System.out.println("Вы угадали!");
                    Play(true);
                } else {
                    System.out.println("Вы не угадали...");
                }
            }


       }

            while (Play(true));


            }
  public static boolean Play(boolean znak) {


 System.out.println("Играть еще раз? 1 - Да, 0 - Нет");
            Scanner scanner1 = new Scanner(System.in);
            int p = scanner1.nextInt();
            if (p==1) {  znak = true ;} else znak = false;
    return znak;
  }

    
    }

