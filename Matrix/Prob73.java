//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
class Prob73
{
    public void setZeroes(int[][] matrix) 
    {
         //make two lists of rows and columns having 0 in them
        List<Integer> rowlist=new ArrayList<>();
        List<Integer> columnlist=new ArrayList<>();
       
       //iterate through each row and column
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                //if 0 found at a particular row and column
                if(matrix[i][j]==0)
                {
                    //add row to list of rows
                    rowlist.add(i);
                    //add column to list of colums
                    columnlist.add(j);
                }
            }
        }
        //put zeros in that particular row or column only.
        putzero(matrix,rowlist,columnlist);
    }
    public void putzero(int matrix[][],List<Integer> rowlist,List<Integer> columnlist)
    {
        //iterate through every row which contains 0 in it
        for(int row:rowlist)
        {
            //set zeros for all columns in that particular row only
           for(int j=0;j<matrix[0].length;j++)
         {
            matrix[row][j]=0;
         }
        }
        ///iterate through every column which contains 0 in it
       for(int col:columnlist)
       {
         //set zeros for all rows in that particular column only
            for(int i=0;i<matrix.length;i++)
         {
            matrix[i][col]=0;
         }
       }
        
         
         
       }
}
