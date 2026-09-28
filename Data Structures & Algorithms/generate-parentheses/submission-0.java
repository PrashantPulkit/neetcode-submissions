class Solution {
    List<String> brac = new ArrayList<>();
    int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs("(",1,0);
        return brac;
    }
    private void dfs(String s,int no,int nc){

       if( nc<no){
       dfs(s+")",no,nc+1);
       }
       if(no<n){
        dfs(s+"(",no+1,nc);
       }
       if(nc==n &&no==n){
        brac.add(s);
        
        return ;
       }
    }
}
