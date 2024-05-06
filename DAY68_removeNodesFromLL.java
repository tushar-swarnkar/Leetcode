public class DAY68_removeNodesFromLL {

    // LEETCODE : 2487

    public static void main(String[] args) {

    }

    static ListNode removeNodes(ListNode head) {
        if (head == null)
            return null;
        head.next = removeNodes(head.next);
        return head.next != null && head.val < head.next.val ? head.next : head;
    }

    static public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
