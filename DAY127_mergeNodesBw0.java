
class ListNode {
    int val;
    ListNode next;

    ListNode () {}
    ListNode (int val) {
        this.val = val;
    }
    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class DAY127_mergeNodesBw0 {
    public ListNode mergeNodes(ListNode head) {
        ListNode dum = new ListNode();
        ListNode sumNode = dum;
        ListNode node = head.next;

        for (int sum = 0; node != null; node = node.next) {
            if (node.val == 0) {
                sumNode.next = new ListNode (sum);
                sumNode = sumNode.next;
                sum = 0;
            } else {
                sum += node.val;
            }
        }

        return dum.next;
    }
}