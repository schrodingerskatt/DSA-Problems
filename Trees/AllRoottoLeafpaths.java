
 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;

     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 };

import java.util.ArrayList;
import java.util.List;


public class AllRoottoLeafpaths {
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        List<String>ans = new ArrayList<>();
        if(root == null) return ans;
        StringBuilder s = new StringBuilder("");
        allPaths(root, ans, s);
        return ans;
    }

    public static void allPaths(BinaryTreeNode root, List<String>ans, StringBuilder s){
        if(root == null){
            return;
        }
        s.append(root.data);
        if(isLeaf(root)){
            ans.add(s.toString());
        }else{
            s.append(' ');
            allPaths(root.left, ans, new StringBuilder(s));
            allPaths(root.right, ans, new StringBuilder(s));
        }
    }

    public static boolean isLeaf(BinaryTreeNode root){
        return ((root.left == null)&&(root.right == null));
    }
}