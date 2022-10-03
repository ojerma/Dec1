package org.example;

import java.util.Scanner;

public class Main {

    public static void getResult(int a) {
        System.out.println("The area of a circle with radius" + (3.14 * a * a));
    }

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getResult(scanner.nextInt());

    }

    }
      //  public static void main(String[] args) {
      //  String name = "Olga";
      //  System.out.println("Hello " + name);

    }

}