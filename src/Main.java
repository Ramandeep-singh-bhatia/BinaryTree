import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node6;

        System.out.println("Inorder Traversal");
        DFSInorderRecursive dir = new DFSInorderRecursive();
        DFSInorderIterative dii = new DFSInorderIterative();
        List<Integer> result1 = dir.inorder(node1);
        List<Integer> result2 = dii.inorder(node1);

        for (Integer i : result1) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (Integer i : result2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        System.out.println("Preorder Traversal");
        DFSPreorderRecursive dpr = new DFSPreorderRecursive();
        DFSPreorderIterative dpi = new DFSPreorderIterative();
        List<Integer> result3 = dpr.preorder(node1);
        List<Integer> result4 = dpi.preorder(node1);

        for (Integer i : result3) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (Integer i : result4) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        System.out.println("Postorder Traversal");
        DFSPostorderRecursive dpor = new DFSPostorderRecursive();
        DFSPostorderIterative dpoi = new DFSPostorderIterative();
        List<Integer> result5 = dpor.postorder(node1);
        List<Integer> result6 = dpoi.postorder(node1);

        for (Integer i : result5) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        for (Integer i : result6) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        MinMaxDepth mmd = new MinMaxDepth();
        System.out.println("Min Depth - " + mmd.minDepth(node1));
        System.out.println("Max Depth - " + mmd.maxDepth(node1));

        System.out.println(" ");
        TreeNode root1 = new TreeNode(1);
        TreeNode root1node2 = new TreeNode(2);
        TreeNode root1node3 = new TreeNode(3);
        TreeNode root1node4 = new TreeNode(4);
        TreeNode root1node5 = new TreeNode(5);
        root1.left = root1node2;
        root1.right = root1node3;
        root1node2.left = root1node4;
        root1node3.left = root1node5;
        TreeNode root2 = new TreeNode(1);
        TreeNode root2node2 = new TreeNode(2);
        TreeNode root2node3 = new TreeNode(3);
        TreeNode root2node4 = new TreeNode(4);
        TreeNode root2node5 = new TreeNode(5);
        root2.left = root2node2;
        root2.right = root2node3;
        root2node2.left = root2node4;
        root2node3.right = root2node5;

        SameTree st = new SameTree();
        if(st.isSameTree(root1, root2))
            System.out.println("Same Tree");
        else
            System.out.println("Different Tree");

        TreeNode root3 = new TreeNode(1);
        TreeNode root3node2 = new TreeNode(2);
        TreeNode root3node3 = new TreeNode(2);
        TreeNode root3node4 = new TreeNode(4);
        TreeNode root3node5 = new TreeNode(5);
        root3.left = root3node2;
        root3.right = root3node3;
        root3node2.left = root3node4;
        root3node3.right = root3node5;
        SymmetricTree smt =new SymmetricTree();
        if(smt.IsSymmetric(root3))
            System.out.println("Symmetric Tree");
        else
            System.out.println("Not Symmetric Tree");

        TreeView tv = new TreeView();
        System.out.println();
        System.out.println("Left Side View BFS");

        List<Integer> result7 = tv.leftviewbfs(node1);


        for (Integer i : result7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Left Side View DFS");

        List<Integer> result8 = tv.leftviewdfs(node1);


        for (Integer i : result8) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Right Side View BFS");

        List<Integer> result9 = tv.rightviewbfs(node1);


        for (Integer i : result9) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Right Side View DFS");

        List<Integer> result10 = tv.rightviewdfs(node1);


        for (Integer i : result10) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Bottom View BFS");

        List<Integer> result11 = tv.bottomviewbfs(node1);


        for (Integer i : result11) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Bottom View DFS");

        List<Integer> result12 = tv.bottomviewdfs(node1);


        for (Integer i : result12) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Top View BFS");

        List<Integer> result13 = tv.topviewbfs(node1);


        for (Integer i : result13) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Top View DFS");

        List<Integer> result14 = tv.topviewdfs(node1);


        for (Integer i : result14) {
            System.out.print(i + " ");
        }
    }
}