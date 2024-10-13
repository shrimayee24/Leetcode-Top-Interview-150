//calculate max h index
//h index= h number of papers which are published at least h times individually.
class Prob274
{
    public int hIndex(int[] citations) 
    {
        //max h-index=length of array

        //create array to store count of research papers indexwise
        //length of new array=citations.length+1 since max value=last index of new array=length of old array
        int m=citations.length;

        //citations.length=last index of arr
        int arr[]=new int[m+1];
    
    //store count of papers indexwise
    //if value in citations=index of arr,increment count 
//store value in that index of new array

        for(int c:citations)
        {
          //if value is greater than last index of arr,increment count
          //store count in last index of count only
          //since papers cited which are >length are also >earlier indices
          if(c>m)
          {
            arr[arr.length-1]++;
          }
          else
          {
            //if value in citations matches index of arr,increment count in that index of arr
            arr[c]++;
          }

        }

        //check count
        int count=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            //increment count as indices are decremented
            //since no of papers published>latter indices are also >previous indices
          count=count+arr[i];
          if(count>=i)
          {
            return i;
          }
        }
        return 0;
    }
}
