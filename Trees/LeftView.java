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


public class LeftView {
    public static void printLeftView(TreeNode<Integer> root) {
       ArrayList<Integer>ans = new ArrayList<>();
       recursionLeft(root, 0, ans);
       for(int i = 0; i < ans.size(); i++){
           System.out.print(ans.get(i)+" ");
       }
       
    }

    public static void recursionLeft(TreeNode<Integer>root, int level, ArrayList<Integer>ans){
        if(root == null){
            return;
        }
        if(ans.size() == level){
            ans.add(root.data);
        }
        recursionLeft(root.left, level + 1, ans);
        recursionLeft(root.right, level + 1, ans);
    }
}