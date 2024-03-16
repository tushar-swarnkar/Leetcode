import java.util.HashMap;
import java.util.Map;

public class DAY16_contiguousArray {
    public static void main(String[] args) {
        int[] arr = {0,1};

        System.out.println(findMaxLength(arr));
    }

    static int findMaxLength(int[] nums) {
        int maxSum = 0;
        int currSum = 0;

        Map<Integer, Integer> track = new HashMap<>();

        track.put (0, -1);

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i] == 0 ? -1 : nums[i];

            if (track.containsKey (currSum)) {
                maxSum = Math.max (maxSum, i - track.get (currSum));
            } else {
                track.put (currSum, i);
            }
        }

        return maxSum;
    }
}
