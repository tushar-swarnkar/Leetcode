public class DAY07_linkedListMid {
    public static void main(String[] args) {
        
    }
    static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode() {}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
