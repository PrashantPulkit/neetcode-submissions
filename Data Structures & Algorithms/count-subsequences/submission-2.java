class Solution {
    public int numDistinct(String s, String t) {
        int dp[][] = new int[t.length()][s.length()+1];
        int c=0;
        int idx=0;
       for(char a : s.toCharArray()){
        if(a==t.charAt(0)){
         c++;
        }
        dp[0][idx+1] = c;
        idx++;
       }
        for(int i =1; i<t.length();i++){
            
            for(int j =i+1; j<s.length()+1;j++){
                if(s.charAt(j-1)==t.charAt(i)){
                    dp[i][j]= dp[i-1][j-1] + dp[i][j-1];
                }else{dp[i][j]= dp[i][j-1];
                }
            }

        }
        for(int[] row : dp){
            for(int elem : row){
                System.out.print(elem);
            }
            System.out.println();
        }
        return dp[t.length()-1][s.length()];
        
    }
}
