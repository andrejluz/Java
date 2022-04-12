package lt.bit.day20220412;

public class AtspausdintiSveikuSkaiciuMasyva {
    public static void main(String[] args) {
        int[] masyvas = new int[5];
        masyvas[0] = 1;
        masyvas[1] = 12;
        masyvas[2] = 13;
        masyvas[3] = 14;
        masyvas[4] = 15;


        atspausdintiMasyva(masyvas);
    }

    public static void atspausdintiMasyva(int[] x) {
        for (int item : x) {
            System.out.println(item);
        }
    }
}
