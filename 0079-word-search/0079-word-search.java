class Solution {
    public boolean exist(char[][] board, String word) {
        //using dfs to solve this Qs.
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] &&
                   isExist(board,i,j,word,0))return true;
            }
        }
        return false;
    }
    public boolean isExist(char[][] board, int i, int j, String word, int pos){
        if(pos==word.length())return true;//if word matched.
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(pos)!=board[i][j])return false; //checking out of bound conditions
        char ch= board[i][j];
        board[i][j] = '*';
        if(isExist(board,i+1,j,word,pos+1)
          || isExist(board,i,j+1,word,pos+1)
          || isExist(board,i-1,j,word,pos+1)
          || isExist(board,i,j-1,word,pos+1))return true; //checking in left, right, top, bottom direction.
        board[i][j]=ch; //backtracking
        return false;
        
    }
}