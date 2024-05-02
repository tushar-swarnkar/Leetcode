import java.util.Arrays;

public class DAY63_largestPositiveNumExists {

    // LEETCODE : 2441

    public static void main(String[] args) {
        int[] n = {-1,2,-3,3};
        System.out.println(findMaxK(n));
    }
    static int findMaxK(int[] nums) {
        Arrays.sort (nums);
        int left = 0, right = nums.length - 1;
        int max = -1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == 0) {
                max = Math.max (max, nums[right]);
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
