package Paket.Lesson2;

public class ForExample {
    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
//            for (int j = 0; j<5; j++) {
//             System.out.println("i = " + i + "; j = " + j);
//        }
//
//    }

//       }
       String str = "12345";
       for (int i=0; i<5; i++){
           str.charAt(0);
           char c = str.charAt(i);
           System.out.println(c);
       }
System.out.println("ForEach example:");
        for (char c : str.toCharArray()) {
            System.out.println(c);
            
        }

        int stopDigit = 7;
        for (int i = 0; i < 20 ; i++) {
            if (i == stopDigit ) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
           System.out.println(i);
        }
}}
