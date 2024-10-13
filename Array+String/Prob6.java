//place characters in zigzag manner and print row-wise
//logic is exactly same as that of text encryption using railfence cipher

class Prob6
{
    public String convert(String s, int numRows) 
    {
        //initialize 2D character array with rows=numrows, columns=string length
        int rows=numRows,cols=s.length();
        char zigzag[][]=new char[rows][cols];
        //if rows=1,no zigzag arrangement, return string as it is
        if(numRows==1)
        {
            return s;
        }

        //initialize all indices in array with "+" character
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                zigzag[i][j]='+';
            }
        }
      //zigzag arrangement
        
        //initialize boolean flag to when to go diagonally upward rowwise while placing elements diagonally downward
       
        boolean goUp=false;
        int c=0,r=0;
        while(c<cols)
        {
            //place first element 
           zigzag[r][c]=s.charAt(c);
           //if at first row, dont go up
           if(r==0)
           {
             goUp=false;
           }
           //if reached last row,go upwards
           else if(r==rows-1)
           {
            goUp=true;
           }
           //decrement row index to go up
           //start placing elements diagonally upward
           if(goUp)
           {
            r--;
           }
           //else keep placing diagonally downward
           else
           {
            r++;
           }
           //simultaneously traverse columns to place in zigzag order
           //just go down or up row-wise
           c++;
        }

        //place characters rowwise in stringbuilder except for "+" characters used to fill remaining array indices
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(zigzag[i][j]!='+')
                {
                    sb.append(zigzag[i][j]);
                }
               
            }
        }
        return sb.toString();
    }
}
