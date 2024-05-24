import java.util.Arrays;
import java.util.HashMap;

public class DAY86_noOfSubsets {

    // LEETCODE : 2597 

    public static void main(String[] args) {
        
    }
    static HashMap<Integer, Integer> freq;

    static int beautifulSubsets(int[] nums, int k, int i) {
        if (i == nums.length) { // base case
            return 1;
        }
        int result = beautifulSubsets(nums, k, i + 1); // nums[i] not taken
        if (!freq.containsKey(nums[i] - k)) { // check if we can take nums[i]
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            result += beautifulSubsets(nums, k, i + 1); // nums[i] taken
            freq.put(nums[i], freq.get(nums[i]) - 1);
            if (freq.get(nums[i]) == 0) {
                freq.remove(nums[i]);
            }
        }
        return result;
    }

    static int beautifulSubsets(int[] nums, int k) {
        freq = new HashMap<Integer, Integer>();
        Arrays.sort(nums);
        return beautifulSubsets(nums, k, 0) - 1; // -1 for empty subset
    }
}
