class Solution {
    HashMap<Integer,Integer> memo = new HashMap<>();

    public int tribonacci(int n) {
        if(memo.containsKey(n)){
           return memo.get(n);
        }
        if(n==2 || n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int ans = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        memo.put(n,ans);
        return ans;
    }
}