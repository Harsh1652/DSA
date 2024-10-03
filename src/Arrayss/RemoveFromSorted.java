package Arrayss;

public class RemoveFromSorted {
    public RemoveFromSorted() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 4, 4, 5, 5};
        int i = 0;

        int k;
        for(k = 1; k < arr.length; ++k) {
            if (arr[i] != arr[k]) {
                ++i;
                arr[i] = arr[k];
            }
        }

        System.out.println("Number of unique elements: " + (i + 1));
        System.out.print("Unique elements: ");

        for(k = 0; k <= i; ++k) {
            System.out.print(arr[k] + " ");
        }

    }
}
