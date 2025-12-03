package Recursion;

public class Merge_Sort {

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while(left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while(left <= mid) {
            temp[k++] = arr[left++];
        }

        while(right <= high) {
            temp[k++] = arr[right++];
        }

        for(int i = 0; i < temp.length; ++i) {
            arr[low + i] = temp[i];
        }

    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    
}
