//rotate matrix by 90 degrees
//find transpose of matrix
//reverse every row of transpose
class Prob48
{
    public void rotate(int[][] matrix) 
    {
        int n=matrix.length;
        
      //find transpose in place
        for(int i=0;i<n;i++)
        {
            //just swap elements iteratively having indices starting from [i][i+1]
            for(int j=i+1;j<n;j++)
            //j initialized to i+1 to avoid redundant swaps and avoid swapping elements in diagonal of matrix
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
      //reverse row of transpose
        for(int i=0;i<n;i++)
        {
            //retrieve curr row iteratively
            int arr[]=matrix[i];
            //reverse the row
            reverseRow(arr);
        }
    }

    public void reverseRow(int arr[])
    {
       int left=0,right=arr.length-1;
       //swap extreme elements 
       //symmterically move pointers
       while(left<right)
       {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        
       }
    }
}
