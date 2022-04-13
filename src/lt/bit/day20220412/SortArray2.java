package lt.bit.day20220412;

public class SortArray2 {
    public static void main(String[] args) {

        int [] arr = {3,5,6,8,1,2,9};


        minToMax2(arr);
        printArr(arr);
    }


    public static void printArr(int[] arr) {

        for(int item : arr) {

            System.out.print(item + " ");
        }
    }


    public static void minToMax2(int [] arr) {

        boolean isSort = false;

        while(!isSort){
            isSort = true;
            for(int i = 1;  i < arr.length; i++) {
                if (arr[i] > arr[i-1] ) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    isSort = false;
                }
            }
        }
    }


}
