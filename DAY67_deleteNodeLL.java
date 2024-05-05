public class DAY67_deleteNodeLL {

    // LEETCODE : 237

    public static void main(String[] args) {

    }

    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
