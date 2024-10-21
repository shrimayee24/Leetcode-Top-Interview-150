//minimum arrows required to burst balloons
//overlapping of end points and start points
class Prob452
{
    public int findMinArrowShots(int[][] points) 
    {
        //minimum 1 arrow required
        int count=1;
        //optimized way-shoot arrows at end of balloons
        //sort array based on ending points
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        //keep track of end point-initialize to end point of first balloon
        int end=points[0][1];
        for(int i=1;i<points.length;i++)
        {
            //if end point of prev balloon and start point of curr balloon dont overlap increment arrow count
            if(points[i][0]>end)
            {
                //increment number of arrows if no overlap found
                count++;
                //update end to current balloon's end for next iteration if no overlap
                end=points[i][1];
            }
        }
        return count;

        
    }
}
