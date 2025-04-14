import java.util.ArrayList;
import java.util.List;

public class DFSPreorderRecursive {

    public List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result){
        if(root == null)
            return;
        result.add(root.val);
        dfs(root.left, result);
        dfs(root.right, result);
    }
}
