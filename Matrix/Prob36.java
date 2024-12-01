//valid sudoku
class Prob36 
{
    public boolean isValidSudoku(char[][] board) {
        // Use HashMaps to track rows, columns, and boxes

        //row hashmap:key=row index value=set of row values of particular row index
        HashMap<Integer, HashSet<Integer>> rows = new HashMap<>();

         //column hashmap:key=row index value=set of row values of particular column index
        HashMap<Integer, HashSet<Integer>> columns = new HashMap<>();

        //box hashmap:key:String of box row index, box column index values:set in 3*3 box having particular box rowindex and box column index
        HashMap<String, HashSet<Integer>> boxes = new HashMap<>();
        
        // Iterate through each cell in the board
        for (int r = 0; r < board.length; r++) 
        {
            for (int c = 0; c < board[0].length; c++) 
            {
                //if cell contains . character,ignore
                if (board[r][c] == '.') continue;
                
                //else convert character digit into integer
                int currelement = board[r][c] - '0';

                // Check row 

                //if row not traversed earlier, put rowindex as key and initialize hashmap
                rows.putIfAbsent(r, new HashSet<>());

                //if row present:
                
                //retrieve hashset, if hashset already contains element, element is present in that row more than once:invalid sudoku
                if (rows.get(r).contains(currelement)) {
                    return false;
                }

                //if element not present,add element to row hashset of that row index
                rows.get(r).add(currelement);

                // similiarly check for column

                columns.putIfAbsent(c, new HashSet<>());
                if (columns.get(c).contains(currelement)) {
                    return false;
                }
                columns.get(c).add(currelement);

                // Check box

                //box rowindex= rowindex of element/3
                //box columnindex=columnindex of element/3

                //concatenate both indices using comma in string

                //similarly check for each pair of rowindex and columnindex of box
                String boxKey = (r / 3) + "," + (c / 3);
                boxes.putIfAbsent(boxKey, new HashSet<>());
                if (boxes.get(boxKey).contains(currelement)) {
                    return false;
                }
                boxes.get(boxKey).add(currelement);
            }
        }

        return true; // If no conflicts, the board is valid
    }
}


