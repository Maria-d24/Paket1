package Paket.Lesson2.Lesson3;

import java.io.*;
import java.util.Scanner;

public class Consol {

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println("Line from console: " + line);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("exit")) {
            System.out.println("From scanner: " + str);
            str = scanner.nextLine();
        }
    }
}