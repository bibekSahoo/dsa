package tree;

import java.util.ArrayList;

public class PreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.left.left = new TreeNode(60);
        root.left.left.right = new TreeNode(70);
        root.left.right = new TreeNode(50);
        root.left.right.left = new TreeNode(80);
        root.left.right.right = new TreeNode(90);
        root.right.left = new TreeNode(32);
        root.right.right = new TreeNode(43);
        root.right.left.left = new TreeNode(44);
        root.right.left.right = new TreeNode(45);
        root.right.left.right.left = new TreeNode(49);
        root.right.left.left.right = new TreeNode(46);
        root.right.left.left.left = new TreeNode(47);
        new PreOrder().printPreorder(root);
    }
    private void printPreorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.val + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    ArrayList<Integer> finalAns = new ArrayList<>();
    public void preorderTraversalImpl(TreeNode root) {
        if(root == null){
            return;
        }

        finalAns.add(root.val);
        preorderTraversalImpl(root.left);
        preorderTraversalImpl(root.right);
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        preorderTraversalImpl(root);
        return finalAns;
    }

    public int kthsmallest(final int[] A, int B) {
        int minNum = 0;

        for(int i = 0 ; i < B; i++){
            minNum = A[i];
            int minIndx = i;
            for(int j =i+1; j < A.length; j++){
                if(A[j] < minNum){
                    minNum = A[j];
                    minIndx = j;
                }
            }
        }
        return 0;
    }
}

