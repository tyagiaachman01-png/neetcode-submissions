class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
        HashSet<Character> rowset = new HashSet<>();
        HashSet<Character> colset = new HashSet<>();
        for(int j =0 ;j<9;j++){
   if(rowset.contains(board[i][j]) && board[i][j]!='.'){
                return false ;
            }
            else{
                rowset.add(board[i][j]);
            }
if(colset.contains(board[j][i]) && board[j][i]!='.'){
                return false ;
            }
            else{
              colset.add(board[j][i]);
            }


            
        }

        
        }
        for(int i =0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
              HashSet<Character> box = new HashSet<>();

                for(int k=i;k<i+3;k++){
                    for(int l =j;l<j+3;l++){
      if(box.contains(board[k][l])&& board[k][l]!='.'){
                      return false;
                      }
                      else{
                        box.add(board[k][l]);
                      }

                    }
                }
            }
        }

        return true;

    }
}
