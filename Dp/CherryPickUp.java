
class Solution {
public int cherryPickup(int[][] grid) {
int[][] dyno1 = new int[grid.length][grid[0].length];
    int[][] dyno2 = new int[grid.length][grid[0].length];
    int[][][] dynos = new int[2][grid.length][grid[0].length];
    dynos[0] = dyno1;
    dynos[1] = dyno2;

    for(int i = 0; i < 2; i++) {
        for(int row = 0; row < dynos[i].length; row++) {
            for(int col = 0; col < dynos[i][0].length; col++) {
                if(row == 0 && col == 0) continue;
                else if(row == 0) {
                    if(grid[row][col] == -1) {
                        dynos[i][row][col] = -1;
                    } else {
                        dynos[i][row][col] = grid[row][col] + dynos[i][row][col-1];
                    }
                } else if(col == 0) {
                    if(grid[row][col] == -1) {
                        dynos[i][row][col] = -1;
                    } else {
                        dynos[i][row][col] = grid[row][col] + dynos[i][row-1][col];
                    }
                } else {
                    if(grid[row][col] == -1) {
                        dynos[i][row][col] = -1;
                    } else {
                        dynos[i][row][col] = grid[row][col] + Math.max(dynos[i][row][col-1],dynos[i][row-1][col]);
                    }
                }
            }
        }

        // This part clears off the cherries found in the first run through. Definitely could make this cleaner
        if(i == 0) {
            int x = 0;
            int y = 0;
            while(x < grid.length - 1 || y < grid[0].length - 1) {
                if(x == grid.length - 1) {
                    y++;
                    grid[y][x] = 0;
                } else if(y == grid[0].length - 1) {
                    x++;
                    grid[y][x] = 0;
                } else {
                    if(dynos[0][y][x+1] > dynos[0][y+1][x]) {
                        x++;
                        grid[y][x] = 0;
                    } else {
                        y++;
                        grid[y][x] = 0;
                    }
                }
            }
        }
    }

    // Sorry about this mess here! Just gets both of our resulting DP matrices and gets the bottom right element from each
    return dynos[0][grid.length-1][grid[0].length-1]+dynos[1][grid.length-1][grid[0].length-1];
}
