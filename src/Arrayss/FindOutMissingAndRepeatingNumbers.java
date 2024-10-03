package Arrayss;

public class FindOutMissingAndRepeatingNumbers {


    public static int[] MissingAndRepeatingNo(int[] arr) {
        int n = arr.length;
        int xor = 0;

        // Get XOR of all elements in the array and numbers from 1 to n
        for (int i = 0; i < n; ++i) {
            xor ^= arr[i];
            xor ^= i + 1;
        }

        // Get the rightmost set bit in xor
        int setBit = xor & ~(xor - 1);
        int zero = 0, one = 0;

        // Divide elements into two sets based on the set bit
        for (int i = 0; i < n; ++i) {
            if ((arr[i] & setBit) != 0) {
                one ^= arr[i];
            } else {
                zero ^= arr[i];
            }
        }

        // XOR the numbers from 1 to n with the same bit pattern
        for (int i = 1; i <= n; ++i) {
            if ((i & setBit) != 0) {
                one ^= i;
            } else {
                zero ^= i;
            }
        }

        // Check which is the repeating number
        for (int i = 0; i < n; ++i) {
            if (arr[i] == zero) {
                return new int[]{zero, one}; // zero is repeating, one is missing
            }
        }

        return new int[]{one, zero}; // one is repeating, zero is missing
    }
}
