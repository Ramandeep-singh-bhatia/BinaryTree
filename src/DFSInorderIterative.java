import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSInorderIterative {
    public List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty() || root != null){
            while(root != null){
                s.add(root);
                root = root.left;
            }
            root = s.pop();
            result.add(root.val);
            root = root.right;

        }
        return result;
    }
}
