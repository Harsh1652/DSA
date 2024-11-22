package Stack_Queue;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollision {

    public List<Integer> AstCollision(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> st = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // Add positive asteroid to the stack
                st.add(arr[i]);
            }
            else {
                // Process collisions for negative asteroid
                while (!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(arr[i])) {
                    // Remove smaller positive asteroids
                    st.remove(st.size() - 1);
                }
                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(arr[i])) {
                    // Remove equal-sized positive asteroid
                    st.remove(st.size() - 1);
                } else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    // Add negative asteroid if no collision or stack has only negative asteroids
                    st.add(arr[i]);
                }
            }
        }
        return st;
    }

    // TC - O(2N)
    // SC - O(N)
}
