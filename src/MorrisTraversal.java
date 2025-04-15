import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MorrisTraversal {
    public List<Integer> inorder(TreeNode root){
        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                inorder.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    inorder.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return inorder;
    }

    public List<Integer> preorder(TreeNode root){
        List<Integer> preorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                preorder.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    preorder.add(curr.val);
                    curr = curr.left;
                } else {
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }

        return preorder;
    }

    public List<Integer> postorder(TreeNode root){
        List<Integer> postorder = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.right == null){
                postorder.add(curr.val);
                curr = curr.left;
            } else {
                TreeNode prev = curr.right;
                while(prev.left != null && prev.left != curr){
                    prev = prev.left;
                }
                if(prev.left == null){
                    prev.left = curr;
                    postorder.add(curr.val);
                    curr = curr.right;
                } else {
                    prev.left = null;
                    curr = curr.left;
                }
            }
        }
        Collections.reverse(postorder);
        return postorder;
    }
}
