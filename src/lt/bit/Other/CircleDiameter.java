package lt.bit.Other;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleDiameter {
    public static void main(String[] args) {

        System.out.println("Prasome ivesti diametra ? ");
        float diameter = new Scanner(System.in).nextFloat();
        double perimeter = diameter * Math.PI;
        DecimalFormat newPerimeter = new DecimalFormat("##.##");
        System.out.println("Perimetras yra " + newPerimeter.format(perimeter));
    }
}
