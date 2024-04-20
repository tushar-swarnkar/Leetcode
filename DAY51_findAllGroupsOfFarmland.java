import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY51_findAllGroupsOfFarmland {

    // LEETCODE : 1992
    
    public static void main(String[] args) {
        int[][] arr = {{1,0,0}, {0,1,1}, {0,1,1}};

        System.out.println(Arrays.toString (findFarmland(arr)));
    }

    static int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();
        
        int m = land.length;
        int n = land[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int[] coordinates = findFarmlandCoordinates(land, i, j);
                    result.add(coordinates);
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
    
    static int[] findFarmlandCoordinates(int[][] land, int row, int col) {
        int[] coordinates = new int[4];
        coordinates[0] = row;
        coordinates[1] = col;
        
        int m = land.length;
        int n = land[0].length;
        
        int r = row;
        int c = col;
        
        // Finding the bottom-right corner of the farmland group
        while (r < m && land[r][col] == 1) r++;
        while (c < n && land[row][c] == 1) c++;
        coordinates[2] = r - 1;
        coordinates[3] = c - 1;
    
        for (int i = row; i < r; i++) {
            for (int j = col; j < c; j++) {
                land[i][j] = 0;
            }
        }
        
        return coordinates;
    }
}
