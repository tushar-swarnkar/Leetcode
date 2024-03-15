import java.util.Arrays;

// LEETCODE #238

public class DAY15_prodOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString (productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums) {
        // ------------ BETTER APPROACH
        int n = nums.length;
        int[] arr = new int[nums.length];
        
        int left = 1, right = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = right;
            right *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] *= left;
            left *= nums[i];
        }
        return arr;


        // Arrays.fill (arr, 1);
        // int a = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     arr[i] *= a;
        //     a *= nums[i];
        // }
        // a = 1;
        // for (int i = nums.length - 1; i >= 0; i--) {
        //     arr[i] *= a;
        //     a *= nums[i];
        // }

        // return arr;
    }
}