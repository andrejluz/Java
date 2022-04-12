package lt.bit.day20220412;

import java.util.Random;

public class ArrayItemAverage {
    public static void main(String[] args) {


        int[] myArray = new int[10];

        arrayRandomNumber(myArray);
        printArray(myArray);

        double vidurkis = arrayItemAverage(myArray);

        System.out.println("Masyvo vidurkis yra: " + vidurkis);

    }


    public static void arrayRandomNumber(int[] array) {

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
    }


    public static int arrayItemAverage(int[] array) {

        int suma = 0;

        for (int item : array) {
            suma += item;
        }

        return suma / array.length;
    }


    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
