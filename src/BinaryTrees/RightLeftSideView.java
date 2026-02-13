package BinaryTrees;

import java.util.ArrayList;

public class RightLeftSideView {
    ArrayList<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    void rightView(TreeNode current, ArrayList<Integer> result, int level) {
        if (current == null) return;
        if (level == result.size()) {
            result.add(current.val);
        }
        rightView(current.right, result, level + 1);
        rightView(current.left, result, level + 1);
    }
}
