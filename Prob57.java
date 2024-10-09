//insert interval in between and merge intervals
//keep on extending new interval to be added by merging it with intervals in array
//if any interval in array cannot be merged with new interval,add interval as it is in output
//then add the new interval merged with other intervals.
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) 
  {
        List<int[]> output = new ArrayList<>();
        
        // Step 1: Iterate through the existing intervals
        for (int[] interval : intervals) {
            
            // If current interval cannot be merged with new interval and if it comes before new interval,add to output
            if (interval[1] < newInterval[0]) {
                output.add(interval);
            }
             // If current interval cannot be merged with new interval and if it comes after new interval,add the newinterval merged till now
              //update newinterval pointer to current interval not merged for further checking.
            else if (interval[0] > newInterval[1]) {
                output.add(newInterval);
                newInterval = interval; // Update the newInterval to the current one
            }
            // If there is an overlap, merge the currinterval and new interval
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Add the last remaining merged interval
        output.add(newInterval);

        return output.toArray(new int[output.size()][]);
    }
}
