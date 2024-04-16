class Solution {
    public int numIslands(char[][] grid) {
        //using recursive DFS graph traversal approach to solve the problem
        //calling dfs at each direction of i,j to make it 0 if there is 1.
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i, int j, char[][] grid){
        if( i<0 || j<0 //if inbound
            || i>=grid.length || j>=grid[0].length //if outbound
            || grid[i][j] == '0' //if water
        )return ; //simply return
        //else do below
        grid[i][j]='0';
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }
}