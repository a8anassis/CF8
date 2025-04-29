package gr.aueb.cf.ch6;

public class ArrayTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[2][3];

        grid[0][0] = 1;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 6;
        grid[1][1] = 9;
        grid[1][2] = 15;

        int[][] grid2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // traverse
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }


        // traverse with enhanced for
        for (int[] row : grid2) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
