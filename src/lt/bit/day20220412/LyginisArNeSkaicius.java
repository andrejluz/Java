package lt.bit.day20220412;

public class LyginisArNeSkaicius {
    public static void main(String[] args) {

        liginisArSkaicius(5);

    }


    public  static void liginisArSkaicius(int skaicius) {
            String result;

        if (skaicius % 2 == 0) {
            result = "Skaicius yra lyginis";
        } else {
            result = "Skaicius yra nelyginis";
        }

        System.out.println(result);
    }
}
