class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        if (grid[0][0] == ')' || grid[m - 1][n - 1] == '(') return false;
        if ((m + n - 1) % 2 != 0) return false;

        Boolean[][][] memo = new Boolean[m][n][(m + n) / 2 + 1];
        return helper(grid, 0, 0, 0, memo);
    }

    private boolean helper(char[][] grid, int r, int c, int open, Boolean[][][] memo) {
        int m = grid.length, n = grid[0].length;

        // 1. Boundary check using current position (r, c) against total size (m, n)
        if (r >= m || c >= n) return false;

        // 2. Update bracket count
        if (grid[r][c] == '(') open++;
        else open--;

        // 3. Balance check
        if (open < 0 || open > (m + n) / 2) return false;

        // 4. Destination base case
        if (r == m - 1 && c == n - 1) {
            return open == 0;
        }

        // 5. Memoization lookup
        if (memo[r][c][open] != null) return memo[r][c][open];

        // 6. Recurse down and right
        boolean moveRight = helper(grid, r, c + 1, open, memo);
        boolean moveDown = helper(grid, r + 1, c, open, memo);

        return memo[r][c][open] = (moveRight || moveDown);
    }
}