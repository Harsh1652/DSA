package BinaryTrees;

import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left, right;
    public int hd;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BoundaryTraversal {

    boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode cur = root.left;

        while (cur != null) {
            if (!isLeaf(cur)) {
                res.add(cur.val);
            }

            if (cur.left != null) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
    }

    void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if (root == null) return;

        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }

        addLeaves(root.left, res);
        addLeaves(root.right, res);
    }

    void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode cur = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while (cur != null) {
            if (!isLeaf(cur)) {
                temp.add(cur.val);
            }

            if (cur.right != null) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }

    ArrayList<Integer> boundaryTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        if (!isLeaf(root)) {
            res.add(root.val);
        }

        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);

        return res;
    }
}


// TC - O(N)
// SC - O(N)

