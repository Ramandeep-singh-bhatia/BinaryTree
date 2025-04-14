import java.util.ArrayList;
import java.util.List;

public class DFSInorderRecursive {
    public List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result){
        if(root == null)
                return;
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);
    }
}
