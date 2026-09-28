class Solution {
    HashSet<List<Integer>> visited = new HashSet<>();
    public int islandPerimeter(int[][] grid) {
        for(int i=0; i<grid.length;i++){
            for(int j =0 ; j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(grid, i,j);
                }
            }
           
        }
         return 0;
        
    }
    int dfs(int[][] grid,int i,int j){
    ArrayList  a = new ArrayList<>();
    a.add(i);
    a.add(j);
      visited.add(a);
      int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
      int temp =4;
      for(int[] d : dir){
       int row = i + d[0];
       int col = j + d[1];
        ArrayList  b = new ArrayList<>();
    b.add(row);
    b.add(col);

       if(row>=0 && row < grid.length && col>=0 && col < grid[0].length ){
        if(visited.contains(b)){
            temp--;
            continue;
        }else if(grid[row][col]==1){
            temp += dfs(grid,row , col);
            temp --;
        }
       }
      }
      return temp;
    }
}