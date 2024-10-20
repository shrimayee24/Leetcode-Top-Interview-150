//combination sum
//for loop-exploring combos of current call
//backtrack call-recursion-tree hierachy
//come out of call-remove element to explore further combos for elements in next indices
class Prob39
{
    List<List<Integer>> result = new ArrayList<>(); // Initialize the result list
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<Integer> combo = new ArrayList<>();
        Arrays.sort(candidates); // Sorting is optional but can be useful for optimizations
        backtrack(0, 0, combo, candidates, target);
        return result;
    }
    
    public void backtrack(int start, int currsum, List<Integer> combo, int[] candidates, int target)
    {
        //if sum reaches target,add combo to result
        if (currsum == target) 
        {
            result.add(new ArrayList<>(combo)); // Add a new list to result
            //backtrack to previous call to explore further combos
            return;
        }
        if (currsum > target) 
        {
            return; //just return to previous call
        }

        for (int i = start; i < candidates.length; i++) 
        {
            combo.add(candidates[i]); // Add current candidate to combination
            //sum is added in call itself
            backtrack(i, currsum + candidates[i], combo, candidates, target); // Use i for the next call (same element can be reused)
            //if base case reached, come out of call-remove last element to explore combos.
            combo.remove(combo.size() - 1); // Backtrack by removing the last element
        }
    }
}
