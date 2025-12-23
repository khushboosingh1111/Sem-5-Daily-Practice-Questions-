// Last updated: 12/23/2025, 1:48:35 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        // Result list to store all solutions
4        List<List<String>> res = new ArrayList<>();
5        // Board representation
6        char[][] board = new char[n][n];
7        // Initialize board with '.'
8        for (int i = 0; i < n; i++) {
9            Arrays.fill(board[i], '.'); // Fill each row with '.'
10        }
11        // Track columns, main diagonals, and anti-diagonals
12        boolean[] cols = new boolean[n]; // Columns under attack
13        boolean[] diag1 = new boolean[2 * n - 1]; // Main diagonals
14        boolean[] diag2 = new boolean[2 * n - 1]; // Anti-diagonals
15        // Start backtracking from row 0
16        backtrack(0, n, board, res, cols, diag1, diag2);
17        // Return all solutions
18        return res;
19    }
20    
21    private void backtrack(int row, int n, char[][] board, List<List<String>> res,
22                           boolean[] cols, boolean[] diag1, boolean[] diag2) {
23        // If all rows are filled, add solution
24        if (row == n) {
25            List<String> solution = new ArrayList<>();
26            for (char[] r : board) {
27                solution.add(new String(r)); // Convert row to string
28            }
29            res.add(solution); // Add solution to result
30            return;
31        }
32        // Try placing queen in each column
33        for (int col = 0; col < n; col++) {
34            // Calculate diagonal indices
35            int d1 = row - col + n - 1; // Main diagonal
36            int d2 = row + col; // Anti-diagonal
37            // Check if position is under attack
38            if (cols[col] || diag1[d1] || diag2[d2]) continue; // Skip if attacked
39            // Place queen
40            board[row][col] = 'Q'; // Place 'Q'
41            cols[col] = diag1[d1] = diag2[d2] = true; // Mark attacks
42            // Recurse to next row
43            backtrack(row + 1, n, board, res, cols, diag1, diag2);
44            // Backtrack: remove queen
45            board[row][col] = '.'; // Remove 'Q'
46            cols[col] = diag1[d1] = diag2[d2] = false; // Unmark attacks
47        }
48    }
49}