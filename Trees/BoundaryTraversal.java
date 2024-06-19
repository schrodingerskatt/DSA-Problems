
import java.util.*;

class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }


public class BoundaryTraversal{

public static List<Integer> traverseBoundary(TreeNode root){
       List<Integer>res = new ArrayList<>();
       if(root == null){
           return res;
       }
       if(!isLeaf(root)){
           res.add(root.data);
       }
       addLeftBoundary(root, res);
       addLeaves(root, res);
       addRightBoundary(root,res);
       return res;
    }

    public static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }

    public static void addLeaves(TreeNode root, List<Integer>res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        if(root.left!=null){
            addLeaves(root.left, res);
        }
        if(root.right!=null){
            addLeaves(root.right, res);
        }
    }

    public static void addLeftBoundary(TreeNode root, List<Integer>res){
        TreeNode curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)){
                res.add(curr.data);
            }
            if(curr.left!=null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    public static void addRightBoundary(TreeNode root, List<Integer>res){
        TreeNode curr = root.right;
        List<Integer> temp = new ArrayList<>();
        while(curr != null){
            if(!isLeaf(curr)){
                temp.add(curr.data);
            }
            if(curr.right!=null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        for(int i = temp.size()-1; i >= 0; i--){
            res.add(temp.get(i));
        }
    }

}