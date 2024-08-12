import java.util.PriorityQueue;

public class DAY166_ktheElementInStream {
    PriorityQueue<Integer> pq;
    int k = 0;

    public DAY166_ktheElementInStream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for (int i : nums) {
            this.add(i);
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.remove();
        }
        return pq.peek();
    }
}
