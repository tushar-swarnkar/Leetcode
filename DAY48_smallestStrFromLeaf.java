public class DAY48_smallestStrFromLeaf {

    // LEETCODE : 988

    public static void main(String[] args) {

    }

    static String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return ans;
    }

    private static String ans = null;

    static void dfs(TreeNode root, StringBuilder sb) {
        if (root == null)
            return;

        sb.append((char) (root.val + 'a'));

        if (root.left == null && root.right == null) {
            final String path = sb.reverse().toString();
            sb.reverse(); // Roll back.
            if (ans == null || ans.compareTo(path) > 0)
                ans = path;
        }

        dfs(root.left, sb);
        dfs(root.right, sb);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static class TreeNode {
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
