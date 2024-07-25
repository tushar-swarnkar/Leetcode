import java.util.PriorityQueue;

public class DAY148_sortTheArray {
    public int[] sortArray(int[] nums) {
        int i = 0;
        int[] ans = new int[nums.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : nums) {
            pq.offer(n);
        }

        while (!pq.isEmpty()) {
            ans[i++] = pq.poll();
        }

        return ans;
    }
}
