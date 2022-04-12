package lt.bit.Other;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Ivesti mase kilogramais ?");
        float weight = new Scanner(System.in).nextFloat();

        System.out.println("Ivesti ugi centimetrais ?");
        int height = new Scanner(System.in).nextInt();

            double ugisMetrais =  (double) height/100;

        double bmi = weight / Math.pow(ugisMetrais, 2);



        if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI optimal");
        } else  {
            System.out.println("!");
        }
    }
}
