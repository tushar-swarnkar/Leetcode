public class DAY09_minCommonVal {

    // https://leetcode.com/problems/minimum-common-value/description/

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {2,4};

        System.out.println(getCommon(a, b));
    }

    static int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return -1;
    }
}
