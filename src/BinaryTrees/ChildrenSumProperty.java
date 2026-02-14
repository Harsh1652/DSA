package BinaryTrees;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class ChildrenSumProperty {


    static void change(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        int child = 0;

        if(root.left != null){
            child += root.left.data;
        }

        if(root.right != null){
            child += root.right.data;
        }

        if(child >= root.data){
            root.data = child;
        }
        else{
            if(root.left != null){
                root.left.data = root.data;
            }
            if(root.right != null){
                root.right.data = root.data;
            }
        }

        change(root.left);
        change(root.right);

        int total = 0;
        if(root.left != null){
            total += root.left.data;
        }
        if(root.right != null){
            total += root.right.data;
        }
        root.data = total;
    }
}


// TC - O(N)
// SC - O(N)
