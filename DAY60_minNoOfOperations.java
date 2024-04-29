public class DAY60_minNoOfOperations {

    // LEETCODE : 2997

    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int k = 1;

        System.out.println(minOperations(nums, k));
    }
    static int minOperations(int[] nums, int k) {
        int finalXor = 0;
        // XOR of all integers in the array.
        for (int n : nums) {
            finalXor = finalXor ^ n;
        }
        
        int count = 0;
        while (k > 0 || finalXor > 0) {
            if ((k % 2) != (finalXor % 2)) {
                count++;
            }
            
            k /= 2;
            finalXor /= 2;
        }
        
        return count;
    }
}