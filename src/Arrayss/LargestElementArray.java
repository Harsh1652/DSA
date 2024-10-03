
package Arrayss;

public class LargestElementArray {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 2};
        int largest = arr[0];
        int[] var3 = arr;
        int var4 = arr.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int val = var3[var5];
            if (val > largest) {
                largest = val;
            }
        }

    }
}
