package Recursion;

public class MergeSort {
    public MergeSort() {
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

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

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 5, 7, 9, 1, 3};
        System.out.println("Before sorting:");
        int[] var2 = arr;
        int var3 = arr.length;

        int var4;
        int num;
        for(var4 = 0; var4 < var3; ++var4) {
            num = var2[var4];
            System.out.print("" + num + " ");
        }

        System.out.println();
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        var2 = arr;
        var3 = arr.length;

        for(var4 = 0; var4 < var3; ++var4) {
            num = var2[var4];
            System.out.print("" + num + " ");
        }

    }
}
