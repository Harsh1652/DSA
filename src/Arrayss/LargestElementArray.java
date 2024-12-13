
package Arrayss;

public class LargestElementArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 2};
        int largest = arr[0];
        int[] a = arr;
        int n = arr.length;

        for(int i = 1; i < n; i++) {
            int val = a[i];
            if (val > largest) {
                largest = val;
            }
        }

    }
}
