//traverse matrix in spiral order
class Prob54
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        //initialize output list
        List<Integer>output=new ArrayList<>();

        //initialize left and left to extreme columns
        int left=0,right=matrix[0].length-1;
        
        //initialize top and bottom to extreme rows
        int top=0,bottom=matrix.length-1;
        
        //do this iteratively for each boundary layer
        //shrink boundaries when all elements are covered
        //do this until we reach the central element
        while(top<=bottom && left<=right)
        {
        //put elements in first row
        for(int j=left;j<=right;j++)
        {
          output.add(matrix[top][j]);
        }
        //top row covered, move top to next row
        top++;

        //add elements of last column
        //condition checks that top never exceeds bottom-also true for 1D array
        for(int i=top;i<=bottom;i++)
        {
            output.add(matrix[i][right]);
        }
        //last column covered,shift right to previous column
        right--;
        //check if row exists or not to be covered
        if(top<=bottom)
        {
          //add elements of last row in reverse
        for(int j=right;j>=left;j--)
        {
          output.add(matrix[bottom][j]);
        }
        //bottom row covered,move bottom up
        bottom--;
        }
        
        //check if column exists or not to be covered
        if(left<=right)
        {
            //add elements of first column upwards until top boundary reached
        for(int i=bottom;i>=top;i--)
        {
            output.add(matrix[i][left]);
        }
        //first column covered,move left
        left++;
        }

        }
        
        

        
        return output;
    }
}
