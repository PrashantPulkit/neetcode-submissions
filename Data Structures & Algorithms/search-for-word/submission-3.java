class Solution {
    boolean[][] visited;
    String word;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        visited= new boolean[board.length][board[0].length];
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(int i,int j,int widx){
    
    int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
    if(board[i][j]==word.charAt(widx)){
        visited[i][j]=true;
        if(widx==word.length()-1){
            visited[i][j]=false;
            return true;
        }
      for(int[] d: dir){
        int curri= i + d[0];
        int currj = j+d[1];
        if(curri>=0 && curri<board.length && currj>=0 && currj <board[0].length && !visited[curri][currj]){
           if( dfs(curri, currj,widx+1)){
            visited[i][j]=false;
            return true;
           }
           

        }
      }
    }
    visited[i][j]=false;
    return false;
    }
}
