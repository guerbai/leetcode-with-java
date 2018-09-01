package guerbai.f451_500;

public class IslandPerimeter {

    // https://leetcode.com/problems/island-perimeter/discuss/95001/clear-and-easy-java-solution
    // 画图一算便知.
    private static int islandPerimeter(int[][] grid) {
        int one = 0;
        int neighbour = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    one++;
                    if (j < grid[i].length-1 && grid[i][j+1] == 1) {
                        neighbour++;
                    }
                    if (i < grid.length-1 && grid[i+1][j] == 1) {
                        neighbour++;
                    }
                }
            }
        }
        return one * 4 - neighbour * 2;
    }
}
