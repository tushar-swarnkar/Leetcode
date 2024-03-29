public class DAY29_maxEleInSubarray {
    public static void main(String[] args) {
       int[] arr = {1,3,2,3,3};
       int k = 2;

       System.out.println(countSubarrays(arr, k));
    }

    static long countSubarrays(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;

        for (int num : nums) {
            maxi = Math.max (maxi, num);
        }

        int i = 0, j = 0, count = 0;
        long ans = 0;

        while (j < nums.length) {
            if (nums[j] == maxi) {
                count++;
            }

            if (count >= k) {
                while (count >= k) {
                    ans += nums.length - j;
                    if (nums[i] == maxi) {
                        count--;
                    }
                    i++;
                }
            }
            j++;
        }

        return ans;
    }
}
