package BinaryTrees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaximumPathSum {

    /* 
    int maxPath(Node node, int[] maxi) {
        if (node == null) {
            return 0;
        }
        int leftSum = maxPath(node.left, maxi);
        int rightSum = maxPath(node.right, maxi);
        maxi[0] = Math.max(maxi[0], leftSum + rightSum + node.val);
        return node.val + Math.max(leftSum, rightSum);
    }
    */

    public int maxPathSum(Node root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }
    int maxPathDown(Node node, int[] maxValue) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.val);
        return node.val + Math.max(left, right);
    }

    // TC - O(N)
    // SC - O(N)


}
