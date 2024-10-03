package Arrayss;

public class RotateArrayDtimes {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        int[] temp = new int[k];

        int i;
        for(i = 0; i < k; ++i) {
            temp[i] = arr[n - k + i];
        }

        for(i = n - 1; i >= k; --i) {
            arr[i] = arr[i - k];
        }

        for(i = 0; i < k; ++i) {
            arr[i] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        rotate(arr, 3);
    }
}
