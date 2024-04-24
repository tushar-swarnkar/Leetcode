public class DAY55_nthTribonacciNum {

    // LEETCODE : 1137

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tribonacci(n));
    }
    static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int[] Tribo = new int[n+1];
        Tribo[0] = 0;;
        Tribo[1] = 1;
        Tribo[2] = 1;

        for (int i = 3; i < n + 1; i++) {
            Tribo[i] = Tribo[i-1] + Tribo[i-2] + Tribo[i-3];
        }

        return Tribo[n];
    }
}
