package lt.bit.day20220412;

public class VidurineRaide {
    public static void main(String[] args) {


        String zodis = "asdfg";

        vidurineZodzioRaide(zodis);
    }

    public static void vidurineZodzioRaide(String zodis) {

        char[] raides = zodis.toCharArray();


        if (zodis.length() % 2 == 0) {
            int paskutinemasyvoReiksme = raides.length - 1;

            String vidurineRaide = String.valueOf(raides[paskutinemasyvoReiksme / 2]);
            System.out.println(vidurineRaide);
        } else {
            System.out.println("zodis yra neliginis");
        }
    }
}
