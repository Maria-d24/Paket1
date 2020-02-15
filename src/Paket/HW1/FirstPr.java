package Paket.HW1;

public class FirstPr {

    public static void main(String[] args) {


        System.out.println("Go further, java!");
        System.out.println("I'm" + " a " + "tester");

        float r = 7f;
        float s = 9f;
        double x = r + s;
        System.out.println(x);

        char sym = '@';

        boolean flagok = false;
        System.out.println(flagok);

        String stroka = new String("Good day!");

        System.out.println(stroka);
        System.out.println((stroka.toUpperCase()));
        System.out.println((stroka.toLowerCase()));

        int q = 2;
        int p = 5;
        short h = 1;

        byte l = 2;
        long k = (q + p - h)/l;
        System.out.println("k = " + k);
        System.out.println("q = " + q);
        System.out.println("p = " + p);
        System.out.println("h = " + h);
        System.out.println("l = " + l);


        System.out.println("d/e = " + (q/p));
        System.out.println("d%e = " + (q/p));
        System.out.println(k);

        if (9 == 7) {

            System.out.println("exit");
                    }
    else {
            System.out.println("Going on");    }

    printSms("Myworld");
  double res = add(4f, 18f);
        System.out.println(res);

        Calculator calculator = new Calculator("testttt");
        System.out.println(calculator);
        System.out.println(calculator.add(2, 9));
        System.out.println(calculator.mul(2, 9));
        String homeWork1 = null;


        double res1 = homeWork1(1f,2f,3f,4f);
        System.out.println("res1 = " + res1);
        sumDozen(2, 4);
        nol(-8);
        hw2(-6);
        hw3("Маша");
        hw4((short) 200);

}

private static void hw4(short g) {
        if (g%4 == 0) {
            if (g%400 == 0) {
                if (g%100 != 0)
                System.out.println("Год високосный");
            }


        else {
            System.out.println("Год невисокосный");
        }
}}


private static void hw3(String str) {

        System.out.println("Привет, " + str + "!");
}



    private static void hw2(int a) {

        if (a < 0) {
            System.out.println("true");
        }

    }
private static void nol(int a) {

        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
}

  private static void sumDozen(int a, int b) {
                if ((a + b) <= 20)  {
            System.out.println("true");
        }  else {
                    System.out.println("false");
                }
      if ((a + b) >= 10)  {
          System.out.println("true");
      }  else {
          System.out.println("false");
      }

  }

    private static void printSms(String text) {
        System.out.println(text);
    }

    private static double add(float a, float b) {

        return a + b;
    }
 private static double homeWork1(float a, float b, float c, float d) {

        return a * (b + (c / d));
 }

 public static class Calculator{

   private final String name;


     public Calculator (String name){
            this.name = name;
            
        }
     public int add(int a, int b) {
         return a + b;      }

         public int mul(int a, int b) {
         return a * b;
         }
@Override
     public String toString(){
    //     return super.toString();
    return "Calculator'" + name + "'";
}

 }
}