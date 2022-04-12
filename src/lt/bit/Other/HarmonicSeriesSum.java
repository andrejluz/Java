package lt.bit.Other;

import java.util.Scanner;

public class HarmonicSeriesSum {
    public static void main(String[] args) {
        System.out.println("Iveskyte n  Skaiciu ?");

        int num = new Scanner(System.in).nextInt();

        double sum = 0;

        for (int i = 1; i <= num; i++) {
            double harmonicNum = (double) 1 / i;
            sum = sum + harmonicNum;
        }
        System.out.println("suma = " + sum);
    }
}
