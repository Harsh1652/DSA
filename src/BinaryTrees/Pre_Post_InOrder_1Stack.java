package BinaryTrees;

import java.util.*;

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

class pair {
    TreeNode node;
    int num;

    pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class Pre_Post_InOrder_1Stack {
    void PrePostInOrder(TreeNode root) {
        Stack<pair> st = new Stack<pair>();
        st.push(new pair(root, 1));

        List<Integer> pre = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        List<Integer> in = new ArrayList<>();

        if (root == null)
            return;

        while (!st.isEmpty()) {
            pair it = st.peek();
            if (it.num == 1) {
                pre.add(it.node.val);
                it.num++;
                st.push(it);

                if (it.node.left != null) {
                    st.push(new pair(it.node.left, 1));
                }
            } else if (it.num == 2) {
                in.add(it.node.val);
                it.num++;
                st.push(it);

                if (it.node.right != null) {
                    st.push(new pair(it.node.right, 1));
                }
            } else {
                post.add(it.node.val);
            }
        }

        System.out.println("Preorder: " + pre);
        System.out.println("Inorder: " + in);
        System.out.println("Postorder: " + post);
    }

}
