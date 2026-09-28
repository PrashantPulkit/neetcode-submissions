class Solution {
    
    public int orangesRotting(int[][] grid) {
    Queue<int[]> active = new ArrayDeque<>();
    int fresh = 0;
    int minutes=0;
        for(int i =0 ;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                int[] a = {i,j};
                active.offer(a);
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!active.isEmpty() && fresh>0){

            int actLen= active.size();
            minutes++;
            for(int i =0; i< actLen;i++){
            
                int[] curr = active.poll();
                for (int[] d : dirs) {
    int nr = curr[0] + d[0];
    int nc = curr[1] + d[1];

    if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) {
        if (grid[nr][nc]==1){
            grid[nr][nc]=2;
            fresh--;
            int[] b = {nr,nc};
            active.offer(b);
        }
    }
}

            }
        }
   if(fresh>0){
    return -1;
   }
   return minutes;
    }
}
