

package Recursion;

public class Rev_Array {

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }

    static void reverseArray(int[] arr, int start, int end) {
        int n = arr.length;
        if (start >= n/2) {
            return;
        }
            swap(arr, start, end);
            reverseArray(arr, start + 1, end - 1);
    }
}
  