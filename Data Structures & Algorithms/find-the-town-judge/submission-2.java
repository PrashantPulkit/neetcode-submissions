class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[][] arr = new boolean[n+1][n+1];
        for(int i =0;i<trust.length;i++){
            arr[trust[i][0]][trust[i][1]]=true;;
        }
        for(int i =1 ;i<=n;i++){
            for(int j =1; j<=n;j++){
                if(arr[i][j]){
                    break;
                }else if(j==n){
                    for(int k =1; k<=n;k++){
                       // search the column of selected i and row of k
                       if(!(arr[k][i] || i==k)){
                        break;
                       }else if(k==n){
                         return i;
                       }

                    }
                   
                }
            }
        }
        return -1;
    }
}