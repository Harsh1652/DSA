package Stack_Queue;

public class Celebrity {

    /* 
    //---------------------------------Brute Force----------------------------------
    public int celebrity(int[][] M){
        int n = M.length;

        int [] knowMe = new int[n];
        int [] iKnow = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(M[i][j] == 1){
                    knowMe[j]++;
                    iKnow[i]++;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(knowMe[i] == n-1 && iKnow[i] == 0){
                return i;
            }
        }
        return -1;
    }
    */
    // TC - O(N^2)
    // SC - O(N)


    //-----------------------Optimal Approach--------------------------------------

    public int celebrity(int[][] M){
        int n = M.length;
        int top = 0;
        int down = n - 1;

        while(top < down){
            if(M[top][down] == 1){
                top++;
            }
            else if{M[down][top] == 1}{
                down--;
            }
            else{
                top++;
                down--;
            }
        }

        if (top > down) {
            return -1;
        }
        for(int i = 0; i < n; i++){
            if (i == top) {
                continue;
            }
            if (M[top][i] == 1 || M[i][top] == 0) {
                return -1;
            }
        }
        return top;
    }
    // TC - O(N)
    // SC - O(1)
}
