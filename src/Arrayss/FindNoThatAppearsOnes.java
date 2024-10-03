package Arrayss;

public class FindNoThatAppearsOnes {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 3, 4, 4};
        int n = arr.length;
        int xor = 0;

        for(int i = 0; i < n; ++i) {
            xor ^= arr[i];
        }

        System.out.println(xor);
    }
}
