

package Recursion;

public class RevArray {

    static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
}
