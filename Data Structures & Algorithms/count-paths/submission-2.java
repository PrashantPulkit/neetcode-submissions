class Solution {
    HashMap<List<Integer>,Integer> hm =  new HashMap<>();
    public int uniquePaths(int m, int n) {
        List<Integer> key = Arrays.asList(m,n);

        if(m==1 || n==1){
            return 1;
        }
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        int ans =  uniquePaths(m-1,n) + uniquePaths(m,n-1);
        hm.put(key,ans);
        return ans;
    }
}
