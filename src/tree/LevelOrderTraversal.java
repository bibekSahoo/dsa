package tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null)
                queue.offer(node.left);

            if (node.right != null)
                queue.offer(node.right);
        }
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \   \
                4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Level order traversal:");
//        levelOrderTraversal(root);
        leftViewTree(root);
    }
    public static void leftViewTree(TreeNode root){
        TreeNode dummy = new TreeNode(-1);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        queue.offer(dummy);
        System.out.print(root.val+ " ");
        while (queue.size() > 1){
            TreeNode x = queue.poll();
            if(x == dummy && queue.peek() != null){
                System.out.print(queue.peek().val+ " ");
                queue.offer(dummy);
            }else {
                if(x.left!=null){
                    queue.offer(x.left);
                }if(x.right!=null){
                    queue.offer(x.right);
                }
            }
        }
    }
}
