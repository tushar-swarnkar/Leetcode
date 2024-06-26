import java.util.Arrays;

public class DAY57_minFallingPathSum {

    // LEETCODE : 1289

    public static void main(String[] args) {
        int[][] grid = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(minFallingPathSum(grid));
    }
    static int minFallingPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = Integer.MAX_VALUE;
        int[][] dp = new int[n][m];
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        for(int j = 0; j < m; ++j) {
            dp[0][j] = grid[0][j];
        }

        for(int i = 1; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                int temp = Integer.MAX_VALUE;

                for(int k = 0; k < m; ++k) {
                    if(j != k) {
                        temp = Math.min(temp, grid[i][j] + dp[i - 1][k]);
                    }

                    dp[i][j] = temp;
                }
            }
        }

        for(int j = 0; j < m; ++j) {
            res = Math.min(res, dp[n - 1][j]);
        }

        return res;
    }
}
