import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSPostorderIterative {
    public List<Integer> postorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        while(!s.isEmpty() || root != null){
            if(root != null){
                s.add(root);
                root = root.left;
            } else {
                TreeNode temp = s.peek().right;
                if(temp == null){
                    temp = s.pop();
                    result.add(temp.val);
                    while(!s.isEmpty() && temp == s.peek().right){
                        temp = s.pop();
                        result.add(temp.val);
                    }
                } else {
                    root = temp;
                }
            }

        }


        return result;
    }
}
