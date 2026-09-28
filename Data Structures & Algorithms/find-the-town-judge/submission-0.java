class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] adj = new int[n+1][n+1];
        for(int[] t: trust){
            adj[t[0]][t[1]]=1;
        }
        for(int i =1 ; i<adj.length;i++ ){
            int temp = 0;
            for(int j =1 ; j<adj[0].length ; j++){
            if(adj[i][j]==1){
                temp++;
            }
            }
            if(temp ==0 ){
                for(int k=1; k< n+1; k++){
                    if(adj[k][i]==1){
                        temp++;
                    } 
                }
            if(temp ==n-1){return i;}
            }
        }
        return -1;
    }
}