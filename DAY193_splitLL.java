class ListNode {
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

public class DAY193_splitLL {
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];

        int len = 0;
        ListNode node = root;
        while (node != null) {
            len++;
            node = node.next;
        }

        int n = len / k, r = len % k;

        node = root;
        ListNode prev = null;

        for (int i = 0; node != null && i < k; i++, r--) {
            parts[i] = node;

            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }

            if (prev != null) {
                prev.next = null;
            }
        }

        return parts;
    }
}
