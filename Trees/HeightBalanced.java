import java.util.*;
class BinaryTreeNode<T>
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

public class HeightBalanced {
    public static boolean isBalancedBT(TreeNode<Integer> root) {
        if(root == null) return true;
        int diff = Math.abs(height(root.left)-height(root.right));
        if(diff > 1) return false;
        return isBalancedBT(root.left)&&isBalancedBT(root.right);
    }

    public static int height(TreeNode<Integer>root){
        if(root == null) return 0;
        int lhs = height(root.left);
        int rhs = height(root.right);
        return 1+Math.max(lhs, rhs);
    }
}
