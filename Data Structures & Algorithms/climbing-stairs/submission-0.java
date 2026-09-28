class Solution {
    HashMap<Integer,Integer> hm ;
    Solution (){
        this.hm = new HashMap<>();
    }
    public int climbStairs(int n) {
        if (n == 0) return 0;  
        if (n == 1) return 1;   
        if (n == 2) return 2; 
        if(this.hm.containsKey(n)){
            return this.hm.get(n);
        }
        int a = climbStairs(n-1) + climbStairs(n-2);
        this.hm.put(n,a);
        return a;
    }
    
}
