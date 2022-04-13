package lt.bit.day20220412;

public class sortingArray {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 3, 67};
        sortingArr(arr);
    }


    public static void sortingArr(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }

        for ( int x : arr) {
            System.out.print(x + " ");
        }
    }
}
