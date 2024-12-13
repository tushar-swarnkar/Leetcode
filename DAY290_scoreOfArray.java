import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DAY290_scoreOfArray {
    public long findScore(int[] nums) {
        int n = nums.length;

        List<int[]> sortedNums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sortedNums.add(new int[] { nums[i], i });
        }

        Collections.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));

        long score = 0;

        for (int i = 0; i < n; i++) {
            int num = sortedNums.get(i)[0];
            int idx = sortedNums.get(i)[1];

            if (nums[idx] != -1) {
                score += num;
                nums[idx] = -1;
                if (idx > 0) {
                    nums[idx - 1] = -1;
                }
                if (idx < n - 1) {
                    nums[idx + 1] = -1;
                }
            }
        }

        return score;
    }
}
