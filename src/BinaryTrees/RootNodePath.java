package BinaryTrees;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class RootNodePath {
    Boolean getPath(TreeNode root, ArrayList<Integer> ans, int x){
        if(root == null){
            return false;
        }
        ans.add(root.val);
        if(root.val == x){
            return true;
        }
        if(getPath(root.left, ans, x) || getPath(root.right, ans, x)){
            return true;
        }
        ans.remove(ans.size() - 1);
        return false;
    }

    public ArrayList<Integer> rootToNodePath(TreeNode root, int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        getPath(root, ans, x);
        return ans;
    }
}

// TC - O(N)
// SC - O(N)

