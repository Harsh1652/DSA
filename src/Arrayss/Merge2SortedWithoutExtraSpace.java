package Arrayss;

public class Merge2SortedWithoutExtraSpace {
    public Merge2SortedWithoutExtraSpace() {
    }

    public void swap(int[] arr1, int[] arr2, int left, int right) {
        int temp = arr1[left];
        arr1[left] = arr2[right];
        arr2[right] = temp;
    }

    public void merge(int[] arr1, int[] arr2, int n, int m) {
        int l = n + m;

        for(int gap = l / 2 + l % 2; gap > 0; gap = gap / 2 + gap % 2) {
            int left = 0;

            for(int right = left + gap; right < l; ++right) {
                if (left < n && right >= n) {
                    this.swap(arr1, arr2, left, right);
                } else if (left > n) {
                    this.swap(arr2, arr2, left - n, right - n);
                } else {
                    this.swap(arr1, arr1, left, right);
                }

                ++left;
            }

            if (gap == 1) {
                break;
            }
        }

    }
}
