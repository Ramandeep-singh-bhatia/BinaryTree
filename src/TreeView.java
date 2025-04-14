import java.util.*;

public class TreeView {
    public List<Integer> leftviewbfs(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                root = q.poll();
                if(i == 0)
                    result.add(root.val);
                if(root.left != null)
                    q.add(root.left);
                if(root.right != null)
                    q.add(root.right);
            }
        }

        return result;
    }

    public List<Integer> leftviewdfs(TreeNode root){
        List<Integer> result = new ArrayList<>();
        lvdfs(root, result, 0);

        return result;
    }

    public void lvdfs(TreeNode root, List<Integer> result, int level){
        if(root == null)
            return;
        if(level == result.size())
            result.add(root.val);
        lvdfs(root.left, result, level+1);
        lvdfs(root.right, result, level+1);
    }

    public List<Integer> rightviewbfs(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                root = q.poll();
                if(i == size - 1)
                    result.add(root.val);
                if(root.left != null)
                    q.add(root.left);
                if(root.right != null)
                    q.add(root.right);
            }
        }

        return result;
    }

    public List<Integer> rightviewdfs(TreeNode root){
        List<Integer> result = new ArrayList<>();
        rvdfs(root, result, 0);

        return result;
    }

    public void rvdfs(TreeNode root, List<Integer> result, int level){
        if(root == null)
            return;
        if(level == result.size())
            result.add(root.val);
        rvdfs(root.right, result, level + 1);
        rvdfs(root.left, result, level + 1);
    }

    class Pair<K, V> {
        K key;
        V value;
        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey(){
            return this.key;
        }

        V getValue(){
            return this.value;
        }
    }

    public List<Integer> bottomviewbfs (TreeNode root){
        if(root == null)
            return new ArrayList<>();
        int column = 0;
        Map<Integer, Integer> columnMap = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root, column));

        while(!q.isEmpty()){
            Pair<TreeNode, Integer> p = q.poll();
            root = p.getKey();
            column = p.getValue();

            columnMap.put(column, root.val);
            if(root.left != null)
                q.add(new Pair<>(root.left, column - 1));
            if(root.right != null)
                q.add(new Pair<>(root.right, column + 1));
        }

        return new ArrayList<>(columnMap.values());
    }

    public List<Integer> bottomviewdfs(TreeNode root){
        Map<Integer, Pair<TreeNode, Integer>> columnMap = new HashMap<>();
        List<Integer> result = new LinkedList<>();

        helper(root, 0,0,columnMap);

        for(int col: columnMap.keySet()){
            result.add(columnMap.get(col).getKey().val);
        }

        return result;
    }

    private void helper(TreeNode root, int column, int level, Map<Integer, Pair<TreeNode, Integer>> columnMap){
        if(root == null)
            return;

        if(!columnMap.containsKey((column)) || level >= columnMap.get(column).getValue()){
            columnMap.put(column, new Pair<>(root, level));
        }

        helper(root.left, column - 1, level + 1, columnMap);
        helper(root.right, column + 1, level + 1, columnMap);
    }

    public List<Integer> topviewbfs(TreeNode root){
        if(root == null)
            return new ArrayList<>();

        Map<Integer, Integer> columnMap = new HashMap<>();
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        int column = 0;
        q.add(new Pair<>(root, column));
        while(!q.isEmpty()){
            Pair<TreeNode, Integer> p = q.poll();
            root = p.getKey();
            column = p.getValue();

            if(!columnMap.containsKey(column)){
                columnMap.put(column, root.val);
            }
            if(root.left != null)
                q.add(new Pair<>(root.left, column - 1));
            if(root.right != null)
                q.add(new Pair<>(root.right, column + 1));
        }

        return new ArrayList<>(columnMap.values());
    }

    public List<Integer> topviewdfs(TreeNode root){
        Map<Integer, Pair<TreeNode, Integer>> columnMap = new HashMap<>();
        List<Integer> result = new LinkedList<>();

        topviewhelper(root, 0 ,0 , columnMap);

        for(int col: columnMap.keySet()){
            result.add(columnMap.get(col).getKey().val);
        }

        return result;
    }

    private void topviewhelper(TreeNode root, int column, int level, Map<Integer, Pair<TreeNode, Integer>> columnMap){
        if(root == null)
            return;

        if(!columnMap.containsKey(column) || level < columnMap.get(column).getValue())
            columnMap.put(column, new Pair<>(root, level));

        topviewhelper(root.left, column - 1, level + 1, columnMap);
        topviewhelper(root.right, column + 1, level + 1, columnMap);
    }
}
