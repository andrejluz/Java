package lt.bit.day20220412;

public class maziausiasSkaiciusmasyvo {
    public static void main(String[] args) {

        int[] array = new int[]{1, 5, 3, 7, 0};

        minArrayNumber(array);
    }


    public static void minArrayNumber(int[] array) {

        int maziausiaReiskme = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < maziausiaReiskme) {
                maziausiaReiskme = array[i];
            }
        }


        System.out.println(maziausiaReiskme);
    }
}
