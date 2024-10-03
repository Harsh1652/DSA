package Arrayss;

public class CheckArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4, 6, 5};
        boolean isSorted = true;

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }

    }
}
