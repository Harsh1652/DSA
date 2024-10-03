//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Arrayss;

public class NextPermutation {
    public NextPermutation() {
    }

    public static int[] nextGreaterPermutation(int[] A) {
        int ind = -1;
        int n = A.length;

        int i;
        for(i = n - 2; i >= 0; --i) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind != -1) {
            for(i = n - 1; i >= ind; --i) {
                if (A[i] > A[ind]) {
                    int tmp = A[i];
                    A[i] = A[ind];
                    A[ind] = tmp;
                    break;
                }
            }
        }

        reverse(A, ind + 1, n - 1);
        return A;
    }

    private static void reverse(int[] A, int start, int end) {
        while(start < end) {
            int tmp = A[start];
            A[start] = A[end];
            A[end] = tmp;
            ++start;
            --end;
        }

    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 5, 4, 3, 0, 0};
        int[] ans = nextGreaterPermutation(A);
        System.out.print("The next permutation is: [");

        for(int i = 0; i < ans.length; ++i) {
            System.out.print(ans[i] + " ");
        }

        System.out.println("]");
    }
}
