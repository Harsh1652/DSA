package BinaryTrees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class CheckBalancedBT {

    /* 
    Boolean Check(TreeNode node) {
        if (node == null) {
            return true;
        }

        int Lh = height(node.left);
        int Rh = height(node.right);

        if (Math.abs(Rh - Lh) > 1) {
            return false;
        }

        Boolean left = Check(node.left);
        Boolean right = Check(node.right);

        if (!left || !right) {
            return false;
        }

        return true;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        return 1 + Math.max(lh, rh);
    }

    */
// -------------------------------------------------------------------------------------------------------------
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }

    int dfsHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = dfsHeight(root.left);
        int rightHeight = dfsHeight(root.right);
        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // TC - O(N)
    // SC - O(N)

    
}
