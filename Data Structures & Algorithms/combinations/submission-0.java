class Solution {
    List<List<Integer>> sub = new ArrayList<>();
int n;
int k;
    public List<List<Integer>> combine(int n, int k) {
        this.n=n;
        this.k=k;
        dfs(new ArrayList<>(),1,k);
        return sub;
    }
    private void dfs(List<Integer> path,int i, int depth){
       
        if(depth<=0 ){
            List<Integer> ans = new ArrayList<>(path);
            sub.add(ans);
            return;
        }else{
             if(i>n){
            return;
        }
            path.add(i);
            dfs(path,i+1,depth-1);
            path.remove(path.size()-1);
            dfs(path,i+1,depth);
            return;
        }
    }
}