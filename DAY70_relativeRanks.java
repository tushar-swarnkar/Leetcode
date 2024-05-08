import java.util.Arrays;
import java.util.PriorityQueue;

public class DAY70_relativeRanks {

    // LEETCODE : 506

    public static void main(String[] args) {
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
    static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            pq.add (i);
        }
        int i = 1;
        while (!pq.isEmpty()) {
            int idx = pq.poll();

            if (i > 3) {
                res[idx] = Integer.toString(i);
            } else if (i == 1) {
                res[idx] = "Gold Medal";
            } else if (i == 2) {
                res[idx] = "Silver Medal";
            } else if (i == 3) {
                res[idx] = "Bronze Medal";
            }

            i++;
        }

        return res;
    }
}
