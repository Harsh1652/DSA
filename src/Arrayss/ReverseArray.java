package Arrayss;

public class ReverseArray {
    static void rev(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;

        for (int i = 0; i < n; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

    }
}
