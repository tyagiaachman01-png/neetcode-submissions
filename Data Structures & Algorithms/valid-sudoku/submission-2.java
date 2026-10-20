class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                
                // Skip empty cells
                if (current == '.') {
                    continue;
                }
                
                // Build unique keys for the current number in its row, column, and 3x3 box
                String rowKey = current + " in row " + i;
                String colKey = current + " in col " + j;
                String boxKey = current + " in box " + (i / 3) * 3 + (j / 3);
                
                // Set.add() returns false if the element was already present in the set
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}