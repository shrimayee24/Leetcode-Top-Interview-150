//word break-dynamic programming
//previous end index boundary(i)=start index of current section (j)
class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) {
        //checking whether string exists or not is faster using hashset
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();

        // DP array to track if the string up to index i can be segmented
        //index of dp array: end of a substring:substring contains characters till i-1th index
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: till 0th index,there are no characters- empty string can always be segmented

//i:substring till i-1th index
//j:start of substring
//iteratively find substrings keeping end constant(outer loop) and incrementing start at each iteration(inner loop)
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 0; j < i; j++) {
                // Check if substring s[j:i] exists in the wordSet
                String currstr=s.substring(j, i);
                //dp[j]: previous section from 0 to j-1th index is a valid string in the list or not.
                if (dp[j] && wordSet.contains(currstr)) 
                {
                    //start index of currstring (j)=end index of previous sections for next iterations (i)
                    dp[i] = true;
                    break; // No need to check further if dp[i] is true
                    //dont shrink the substrings further till i-1th index
                }
            }
        }


//check whether substrings till last index can be formed or not
        return dp[n];
    }
}
