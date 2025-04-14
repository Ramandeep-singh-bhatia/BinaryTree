import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSPreorderIterative {
    public List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.add(root);

        while(!s.isEmpty()){
            root = s.pop();
            result.add(root.val);
            if(root.right != null)
                s.add(root.right);
            if(root.left != null)
                s.add(root.left);
        }
        return result;
    }
}
