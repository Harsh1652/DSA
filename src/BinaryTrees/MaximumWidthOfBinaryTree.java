package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Pair {
    TreeNode node;
    int num;

    Pair(TreeNode node, int num){
        this.node = node;
        this.num = num;
    }
}

public class MaximumWidthOfBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int currId = q.peek().num - min;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0){
                    first = currId;
                }
                if(i == size - 1){
                    last = currId;
                }
                if(node.left != null){
                    q.offer(new Pair(node.left, 2 * currId + 1));
                }
                if(node.right != null){
                    q.offer(new Pair(node.right, 2 * currId + 2));
                }
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        return maxWidth;
    }
}
