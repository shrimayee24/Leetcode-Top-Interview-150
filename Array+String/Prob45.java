//greedy bfs solution
class Prob45
{
    public int jump(int[] nums) {
        int result = 0;

        //left, right-> boundaries of current window
        //farthest-> destination reached when max jump taken
        //window=level of a tree
        //indices in window= branches of current level
       
        int left = 0, right = 0,farthest = 0;

        // We stop when our window already reaches or passes the last index-come out of loop
        //we are moving left to next window w.r.t prev right, hence right can move till second last index
        while (right < nums.length - 1) {
           
            // explore the current "level" (window)
            //bfs traversal=calculating maximum jump at current window (level) from a particular index
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            // move the window
            left = right + 1;
            right = farthest;
            //update jump count
            result++;
        }
        return result;
    }
}
