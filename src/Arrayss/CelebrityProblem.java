package Arrayss;

public class CelebrityProblem {

    /*
    // BruteForce
    static int Celebrity(int mat[][], int n){


        int [] knowMe = new int[n];
        int [] iKnow = new int [n];

        for (int i = 0; i < n-1; i++){
            for (int j  = 0; j< n-1; j++){
                if (mat[i][j] == 1){
                    knowMe[j]++;
                    iKnow[i]++;
                }
            }
        }
        for (int i = 0; i < n-1; i++){
            if ((knowMe[i] == n-1) && (iKnow[i] == 0)){
                return i;
            }
        }
        return -1;
    }
    // Tc - O(N*N) + O(N)
    // Sc - O(2N)
     */



    // OptimalApproach

    static int Celebrity(int mat[][], int n) {
        int top = 0;
        int down = n - 1;

        while (top < down) {
            if (mat[top][down] == 1) {
                top++;
            } else {
                down--;
            }
        }
        int candidate = top;
        for (int i = 0; i < n; i++) {
            if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) {
                return -1;
            }
        }
        return candidate;
    }

    // Tc - O(2N)
    // Sc - O(1)

}
