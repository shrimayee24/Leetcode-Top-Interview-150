//game of life
//find neighbours
//1->0= -1, 0->1= 2
class Solution {
    public void gameOfLife(int[][] board) 
    {
        int rows=board.length,cols=board[0].length;
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                //initialize count of neighbours
                int liveNeighbours=0;
                
                //initialize neighbour pointers for current indices
                //find minimum and maximum to avoid out of bounds
                
                int top=Math.max(0,i-1);
                //when row=0,top=max(0,-1)=0 itself

                int bottom=Math.min(rows-1,i+1);
                //if i reaches last row,i+1 = rows thus by taking minimum bottom  will be at last row only
                int left=Math.max(0,j-1);
                //if j reaches 0 column, left would be max (0,-1) which will remain 0 only
                int right=Math.min(cols-1,j+1);
                //if j reaches last column,j+1 will be cols thus by taking minimum right will be at last  column only

                //check all neighbours within bounds of pointers
                for(int curr_row=top;curr_row<=bottom;curr_row++)
                {
                    for(int curr_col=left;curr_col<=right;curr_col++)
                    {
                    //to find neighbours curr_row and curr_col shouldn't be indices of current element
                    //i.e curr_row!=i and curr_col!=j
                    
                    if(!(curr_row==i && curr_col==j) && Math.abs(board[curr_row][curr_col])==1) liveNeighbours++;
                    //if neighbour is 1,increment count of 1s
                    //absolute value is used to compare previous values of neighbours and not updated values
                    //when live cell is dead, it becomes -1, before it was 1. so use absolute value for comparison

                    }
                }
                //number of live neighbours should be between 2 and 3 for a cell to live
                //if not, cell dies
                //if its a live cell becoming dead, change to -1
                if(board[i][j]==1 && (liveNeighbours<2 || liveNeighbours>3))
                {
                   board[i][j]=-1;
                
                }
                //if dead cell becoming alive,change value to 2
                else if(board[i][j]==0 && liveNeighbours==3)
                {
                //if live neighbours=3 dead cell becomes alive
                board[i][j]=2;
                }
            }
       }

       //change -1 to 0, 2 to 1
       for(int i=0;i<rows;i++)
       {
         for(int j=0;j<cols;j++)
         {
            if(board[i][j]==-1)
            {
                board[i][j]=0;
            }
            else if(board[i][j]==2)
            {
                board[i][j]=1;
            }
         }
       }
}
}
