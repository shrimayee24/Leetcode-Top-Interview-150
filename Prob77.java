//number combinations
//almost same as letter combinations of phone number
//recursion:building combination recursively keeping one element constant (one-many) mapping
//for loop-move on to next one constant element to build next combos.
class Prob77 
{
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        if (k == 0) return result;
        dfs(new ArrayList<>(), 1, n, k);
        return result;
    }
    
    // Helper function for backtracking
    public void dfs(List<Integer> currCombo, int start, int n, int k) {
        // Base case: if the current combination's length is k, add it to the result
        if (currCombo.size() == k) {
            result.add(new ArrayList<>(currCombo));
            return;
        }
        
        // Loop through the numbers starting from `start` to `n`
        for (int i = start; i <= n; i++) 
        {
            // Add current number to the combination
            currCombo.add(i);
            
            // Recursively build the next combinations
            dfs(currCombo, i + 1, n, k);
            
            // Backtrack: remove the last added number to explore other combinations
            currCombo.remove(currCombo.size() - 1);

            //out of for loop: out of current call-backtrack to previous call's for loop iteration
        }
    }
}

