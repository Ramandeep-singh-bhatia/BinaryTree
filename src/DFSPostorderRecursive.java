import java.util.ArrayList;
import java.util.List;

public class DFSPostorderRecursive {

    public List<Integer> postorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result){
        if(root == null)
            return;

        dfs(root.left, result);
        dfs(root.right, result);
        result.add(root.val);
    }
}
