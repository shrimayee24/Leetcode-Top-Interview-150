//search for element
//locate row of element first, then search by column
class Prob74 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int row=0,difference=Integer.MAX_VALUE,currdifference=0;
        
        //locate row
        for(int i=0;i<matrix.length;i++)
        {
             //find row where first element is less than target
            if(matrix[i][0]> target) break;
            //calculate minimum difference between element and target
             currdifference=Math.min(difference,target-matrix[i][0]);
             //if difference updated,update row
                if(currdifference!=difference)
                {
                    row=i;
                }
                //update previous value for next iteration
                difference=currdifference;
            
        }
        //after finding row,search columnwise for that particular row only
        for(int j=0;j<matrix[0].length;j++)
        {
            if(target==matrix[row][j])
            {
                return true;
            }
        }
        return false;

        
    }
}
