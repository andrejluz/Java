package lt.bit.Other;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        float firstNumber ;
        String insertChar ;
        float secondNumber;

        try {
            System.out.println("iveskyte pirma skaiciu ");
            firstNumber = new Scanner(System.in).nextFloat();

            System.out.println("Iveskyte veiksma + - / *");
            insertChar = new Scanner(System.in).nextLine();
            System.out.println("iveskyte antra skaiciu ");
            secondNumber = new Scanner(System.in).nextFloat();

            myCalculate(firstNumber, insertChar, secondNumber);

        } catch (Exception e) {
            System.out.println("Illegal format, please provide numbers ");
        }


    }

    public static void myCalculate(float firstNumber, String insertChar, float secondNumber) {
        switch (insertChar) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Cannot calculate. Division by zero prohibited");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            default:
                System.out.println("nera pasirinkta tinkama operacija");
        }
    }
}
