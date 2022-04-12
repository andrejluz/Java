package lt.bit.Other;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Iveskyte skaiciu ");

        int number = new Scanner(System.in).nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int sum;

        int [] array = new int[number];
        array[0] = 0;
        array[1] = 1;

        for(int i = 2; i <= number; i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;

            if (i == number) {
                System.out.println(sum);
            }

            if (i >= number) {
                break;
            }
            array[i] += sum;
        }

        for ( int num : array) {
            System.out.print(num + " ");
        }
    }
}
