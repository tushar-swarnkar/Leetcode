import java.util.Arrays;

public class DAY107_uniqueArrayNumCount {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int tracker = 0;

        for (int num : nums) {
            tracker = Math.max(tracker, num);
            count += tracker - num;
            tracker += 1;
        }

        return count;
    }
}
