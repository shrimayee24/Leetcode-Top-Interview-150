//merge intervals
class Prob56 
{
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store merged intervals
        List<int[]> output = new ArrayList<>();

        // Initialize with the first interval
        int[] currentInterval = intervals[0];
        output.add(currentInterval);
        //try to overlap first interval as much as possible
        //if overlap not possible then move currentinterval pointer to interval not merged for further checking

        for (int i = 1; i < intervals.length; i++) 
        {
            int[] interval = intervals[i];

            // Check if there is an overlap
            if (currentInterval[1] >= interval[0]) {
                // Merge intervals by updating the end time
                //end time is the maximum value of end time among both intervals
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                // If no overlap, move to the next interval
                //update interval at beginning to current interval for checking
                currentInterval = interval;
                output.add(currentInterval);
            }
        }

        // Step 3: Convert the list back to an array and return
        return output.toArray(new int[output.size()][]);
    }
}

    
