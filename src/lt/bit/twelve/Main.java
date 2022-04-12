package lt.bit.twelve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ivesktyte teksta");
            String myText = new Scanner(System.in).nextLine();

//        String myText = "tekstas kuriame yra tarpu          ";

        int space = 0;

        for (char myTextChar : myText.toCharArray()) {
            if (myTextChar == ' ') {
                space++;
            }
        }
        int percentageSpace = (space * 100) / myText.length();
        System.out.println("procentaliai yra: " + percentageSpace + " % ");
    }
}
