//tell whether course will be conducted or not
//course:from node prereq:to node
//directed edge:order of course
//deadlock detection or cycle detection: courses depend on each other as prerequisites: cannot be conducted
class Prob207
{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adjlist = new HashMap<>();
        // Initialize the adjacency list
        //for n numcourses there are courses from 0 to n-1
        for (int i = 0; i < numCourses; i++) {
            adjlist.put(i, new ArrayList<>());
        }
        
        // Build the adjacency list
        for (int[] element : prerequisites) 
        {
            int course = element[0];
            int prereq = element[1];
            adjlist.get(prereq).add(course);
        }

        // Set to track visited nodes in the entire graph
        HashSet<Integer> visited = new HashSet<>();
        // Set to track nodes in the current path (for cycle detection)
        HashSet<Integer> path = new HashSet<>();

        // Perform DFS on each course:start point of path is each course
        //traverse path for each course iteratively
        //path traversal: passing element in list as key in dfs call-mentioned in dfs method
        for (int course = 0; course < numCourses; course++) {
            if (!dfs(adjlist, course, visited, path)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(HashMap<Integer, List<Integer>> adjlist, int course, HashSet<Integer> visited, HashSet<Integer> path) {
        // If we’re visiting a node in the current path, a cycle is detected
        if (path.contains(course)) return false;
        // If we’ve already visited this node in a previous DFS call, no need to visit again
        if (visited.contains(course)) return true;

        // Mark this node as part of the current path
        path.add(course);

        // Perform DFS for all neighbors
        for (int neighbor : adjlist.get(course)) 
        {
            //if cycle detected at any path traversal,dont check further,return false, backtrack to previous node
            if (!dfs(adjlist, neighbor, visited, path)) {
                return false;
            }
        }

        // Remove from path and mark as fully processed
        path.remove(course);
        visited.add(course);

        return true;
    }
}
