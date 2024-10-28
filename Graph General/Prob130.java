//if O at border with neighbours as O,keep them as O
//if O at centre only, mark as X
class Prob130
{
    public void solve(char[][] board) 
    {
        //edge case-empty array
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        
         //temporarily mark Os as Ms so that it is easy to distinguish Os at centre
        //if Os are at centre and marked M, we can tell that they are going to be Os only
        //if they are not marked as M,which means no O at borders,it will be marked as X
        for (int i = 0; i < rows; i++) 
        {
             // Left border check
            if (board[i][0] == 'O') markAsO(board, i, 0);
            // Right border check
            if (board[i][cols - 1] == 'O') markAsO(board, i, cols - 1); 
        }
        for (int j = 0; j < cols; j++) 
        {
            // Top border check
            if (board[0][j] == 'O') markAsO(board, 0, j); 
            // Bottom border check
            if (board[rows - 1][j] == 'O') markAsO(board, rows - 1, j); 
        }

        // Flip all remaining 'O's to 'X' and restore marked 'O's back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
            {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 'M') board[i][j] = 'O'; // 'M' stands for marked
            }
        }
    }

//method called only for borders
    private void markAsO(char[][] grid, int row, int col) 
    {
        //check if index is within  bounds and only 'O' is found
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 'O') 
            return;

        // Mark the current 'O' to avoid flipping it
       // Traverse the borders and recursively mark the connected 'O's as M
        //only Os at borders can be marked as Ms recursively along with neighbours as O else not
        grid[row][col] = 'M';

        // Recursively mark adjacent 'O's
        markAsO(grid, row + 1, col); // Down
        markAsO(grid, row - 1, col); // Up
        markAsO(grid, row, col + 1); // Right
        markAsO(grid, row, col - 1); // Left
    }
}
