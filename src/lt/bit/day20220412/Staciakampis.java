package lt.bit.day20220412;

public class Staciakampis {
    public static void main(String[] args) {

        int a= 20;
        int b = 10;


        System.out.println("Krastiniu ilgiai yra a = " +  a + " b = " + b + " Staciakampio plotas: " + staciakampioPlotas(a,b) );
        System.out.println("Krastiniu ilgiai yra a = " +  a + " b = " + b + " Staciakampio perimetras: " + staciakampioPerimetras(a,b) );


    }


    public static int staciakampioPerimetras(int a, int b) {
        return (a + b) * 2;
    }

    public static int staciakampioPlotas(int a, int b) {
        return a * b;
    }
}
