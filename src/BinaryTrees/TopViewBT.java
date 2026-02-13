package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewBT {
    public ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<pair>();
        q.add(new pair(root, 0));
        while (!q.isEmpty()) {
            pair it = q.remove();
            int hd = it.num;
            TreeNode temp = it.node;
            if (map.get(hd) == null) {
                map.put(hd, temp.val);
            }
            if (temp.left != null) {
                q.add(new pair(temp.left, hd - 1));
            }
            if (temp.right != null) {
                q.add(new pair(temp.right, hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}

// TC - O(N)
// SC - O(N)