public class DAY192_LLinBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);
    }

    boolean dfs(ListNode head, ListNode cur, TreeNode root) {
        if (cur == null)
            return true;
        if (root == null)
            return false;

        if (cur.val == root.val)
            cur = cur.next;
        else if (head.val == root.val)
            head = head.next;
        else
            cur = head;

        return dfs(head, cur, root.left) || dfs(head, cur, root.right);
    }
}

class TreeNode {
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