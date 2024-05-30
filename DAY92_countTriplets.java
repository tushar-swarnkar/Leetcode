public class DAY92_countTriplets {

    // LEETCODE : 1442

    public static void main(String[] args) {

    }

    static int countTriplets(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = 0;
                for (int k = i; k < j; k++) {
                    a ^= arr[k];
                }

                int b = 0;
                for (int k = j; k < n; k++) {
                    b ^= arr[k];
                    if (a == b) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
