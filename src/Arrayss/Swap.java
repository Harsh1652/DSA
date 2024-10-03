package Arrayss;

public class Swap {
    public Swap() {
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 23, 9, 18};
        swap(arr, 1, 3);
    }
}
