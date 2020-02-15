package Paket.HomeWork2;

public class Hw2Task6 {
    public static void main(String[] args) {

       // int[] mas6[];
                // = new int[]{};
        int[] mas6 = {1, 0, 1, 2, 0, 1, 2, 0, 2, 5};

            // вызов метода
            // вывод результата
         hw2t6(mas6);

         //   double res = add(4f, 18f);
          //  System.out.println(res);
        }



    private static void hw2t6 (int[] mas6)   {

            int sl = 0 ;

int sh = 0;
            boolean answer = true;

            for (int i = 0 ; i < 10; i++) {
          sh = sh + mas6[i];

            }

        //    System.out.println("sh = " + sh);
int sp = sh;
            for (int j = 0  ; j < 10 ; j++) {

                sl = sl + mas6[j];

                sp = sp - mas6[j];
               //                 System.out.println("mas6[j] = " + mas6[j] + " sl = " + sl + " j = " + j + " sp = " + sp);
                if (sl == sp) {
           //         System.out.println("j = " + j);
             //       System.out.println("sl = " + sl);
                    System.out.println(answer);
                                       break;
                }
            }

         }
    }

