class Solution {
    int num =0;
    public int numIslands(char[][] grid) {
        searchIslands(grid);
        return num;
    }
    
    void searchIslands(char[][] grid){
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    num++;
                    removeIsland(j,i,grid);
                    
                }
            }
        }
    }
    
    void removeIsland(int x, int y, char[][] grid){
        if(grid[y][x] == '0'){
            return;
        }else{
            grid[y][x] = '0';
        }
        
        if(x+1 < grid[0].length)    
            removeIsland(x+1,y,grid);
        if(y+1 < grid.length)  
            removeIsland(x,y+1,grid);
        if(x-1 >= 0)
            removeIsland(x-1,y,grid);
        if(y-1 >= 0)
            removeIsland(x,y-1,grid);
        
    }
}