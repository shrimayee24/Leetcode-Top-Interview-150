//permutations
class Prob46
{
    public List<List<Integer>> permute(int[] nums) 
    {
        //list to store current permutation
        List<Integer> curr = new ArrayList<>();
        //list to store all permutations
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, curr, ans);
        return ans;  // Added return statement for result
    }

    public void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans) 
    {
        //base case=list of permutations reaches size limit, add it to answer
        if (curr.size() == nums.length) 
        {
            ans.add(new ArrayList<>(curr));  // Add deep copy of curr
            return;
        }

        for (int i = 0; i < nums.length; i++) 
        {
            //if current list doesnt contain element,add it to list
            if (!curr.contains(nums[i])) 
            {
                curr.add(nums[i]);
                //recursively add all elements one by one
                backtrack(nums, curr, ans);
                curr.remove(curr.size() - 1);  // Backtrack by removing last element
                //when backtracked,latest value of i considered for next permutation
            }
        }
    }
}
