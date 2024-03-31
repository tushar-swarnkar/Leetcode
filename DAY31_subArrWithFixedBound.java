public class DAY31_subArrWithFixedBound {

    // LEETCODE 2444

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;

        System.out.println(countSubarrays(nums, minK, maxK));
    }
    static long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        long jbad = -1, jmin = -1, jmax = -1, n = nums.length;

        for (int i = 0; i < n; ++i) {
            if (nums[i] < minK || nums[i] > maxK) jbad = i;
            if (nums[i] == minK) jmin = i;
            if (nums[i] == maxK) jmax = i;
            
            res += Math.max (0L, Math.min (jmin, jmax) - jbad);
        }

        return res;
    }
}
