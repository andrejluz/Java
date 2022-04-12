package lt.bit.Other;

import java.util.Scanner;

public class numberSum {
    public static void main(String[] args) {
        System.out.println("skaicius");
        int num = new Scanner(System.in).nextInt();
        int suma = 0;

        while (num > 0) {
           int num2 = num % 10;
           suma = suma + num2;
           num /=10;
            System.out.println(num);

        }

        System.out.println(suma);
    }
}
