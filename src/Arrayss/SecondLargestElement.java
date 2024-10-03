package Arrayss;

public class SecondLargestElement {
    public SecondLargestElement() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 7, 7, 5, 9, 13};
        int SecondLargest = -1;
        int largest = arr[0];

        int smallest;
        for(smallest = 2; smallest < arr.length - 1; ++smallest) {
            if (arr[smallest] > largest) {
                SecondLargest = largest;
                largest = arr[smallest];
            } else if (arr[smallest] < largest && arr[smallest] > SecondLargest) {
                SecondLargest = arr[smallest];
            }
        }

        smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(SecondLargest);
    }
}
