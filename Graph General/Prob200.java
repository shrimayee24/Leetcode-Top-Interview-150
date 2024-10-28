//find number of islands
class Prob200
{
    public int numIslands(char[][] grid) 
    {
        int numIsland = 0;
        
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                //if land found,increment counter,mark it and neighbours as zero
                //count all neighbours of 1 in same land only-thus mark them as 0
                //avoid revisiting and redundant value additions
                if (grid[row][col] == '1') 
                {
                    //count it as an island
                    numIsland++;
                    // Start a DFS or BFS to mark all adjacent lands as water to keep count constant
                    markIsland(grid, row, col);
                }
            }
        }
        return numIsland;
    }

//recursively mark the lands as water so that they are counted as one alltogether
//recursively find neighbours of neighbours and mark them as zero.
    private void markIsland(char[][] grid, int row, int col) 
    {
        // Check for out-of-bounds and if current neighbour is land or water
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') 
            return;

        // Mark the current land as water to avoid revisiting
        grid[row][col] = '0';

        // Recursively mark all adjacent land pieces
        markIsland(grid, row + 1, col); // Down
        markIsland(grid, row - 1, col); // Up
        markIsland(grid, row, col + 1); // Right
        markIsland(grid, row, col - 1); // Left
    }
}
