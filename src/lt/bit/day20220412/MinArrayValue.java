package lt.bit.day20220412;

public class MinArrayValue {
    public static void main(String[] args) {

        int[] arr = {10, 4,3,5};
//
        printArr(arr);
        minSortToMAx(arr);
        System.out.println(" ");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void minSortToMAx(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j =i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = tmp;
                }
            }
        }
    }
}