public class MinMaxDepth {
    public int minDepth(TreeNode root){
        if(root == null)
            return 0;
        /*if(root.left == null)
            return 1 + minDepth(root.right);
        if(root.right == null)
            return 1 + minDepth(root.left);*/
        return 1 + Math.min(minDepth(root.left) , minDepth(root.right));
    }

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        /*if(root.left == null)
            return 1 + maxDepth(root.right);
        if(root.right == null)
            return 1 + maxDepth(root.left);*/
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}
