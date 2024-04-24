class Solution {
    public boolean exist(char[][] board, String word) {
        //using dfs to solve this Qs.
        //solving story of this problem:: 
            //step1: going on each index and checking if start of the word matching 
            //step2 : if matching then calling a dfs method in which we are checking in all direction of that start that if all word's char is there or not if yes returning true else false
                //to achieve step2 doing below:
                    //checking if pos==word.length (which means word matched)
                    //then checkin out of bound condition and checking if board i,j char is not matched with words char at pos and returning false
                    //then having char in temp and replacing that with * so that we should not rego at that and then running dfs in 4 direction with pos+1 and returning true
                    //else doing backtracking i.e. keeping that char * to its original value and returning false.
                    
        
        
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