import java.util.HashMap;

// LEETCODE : 2958

public class DAY28_subarrayWithMostKFreq {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2};
        int k = 2;

        System.out.println(maxSubarrayLength(arr, k));
    }

    static int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int l = 0;
        
        for (int r = 0; r < nums.length; r++) {
            map.put (nums[r], map.getOrDefault (nums[r], 0) + 1);

            while (map.get(nums[r]) > k) {
                map.put (nums[l], map.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max (ans, r - l + 1);
        }

        return ans;
    }
}
