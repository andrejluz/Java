package lt.bit.vienuoliktas.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean arVykdyti = true;
        int ilgis = 0;
        String ilgiausiasZodis = null;

        while(arVykdyti){
            System.out.println("Iveskite zodi");
            String zodis = scanner.next();

            if(zodis.equals("exit")){
                arVykdyti = false;
            } else {
                if(zodis.length() > ilgis){
                    ilgis = zodis.length();
                    ilgiausiasZodis = zodis;
                }
            }
        }

        System.out.println(ilgiausiasZodis);
    }
}
