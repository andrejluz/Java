package lt.bit.Other;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();
        System.out.println("Iveskyte prasome skaiciu ?");

        for (int i = 1; i <= number; i++) {
            if (i %  3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i %  3 == 0) {
                System.out.println("Fizz");
            } else if (i %  7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Skaicius nesidalina is 3 ir 7");
            }
        }

    }
}
