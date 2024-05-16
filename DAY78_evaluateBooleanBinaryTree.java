public class DAY78_evaluateBooleanBinaryTree {

    // LEETCODE : 2331

    public static void main(String[] args) {

    }

    static boolean helper(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1;
        } else if (root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else if (root.val == 3) {
            return helper(root.left) && helper(root.right);
        }

        return false;
    }

    static boolean evaluateTree(TreeNode root) {
        return helper(root);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
