package Paket.Lesson2.Lesson3;

public class StringFormat {

    public static void main(String[] args) {

        String name = "Masha";
        int age = 38;
  //     String text =  String.format("Hello! My name is %s! I'm %d", name, age);
      //  System.out.println("Hello! My name is " + name + "! I'm " + age );

        System.out.printf("Hello! My name is %s! I'm %d", name, age);
    }
}
