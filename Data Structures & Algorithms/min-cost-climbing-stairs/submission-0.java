class Solution {
    int[] cost;
    HashMap<Integer, Integer> hm = new HashMap<>();
    int dest =0;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        this.dest = cost.length;
        return Math.min(climb(0),climb(1));

    }
    private int climb(int step){
        if(step == this.dest){return 0;}
        if(step == this.dest-1){return this.cost[dest-1];}
        if(step == this.dest-2){return this.cost[dest-2];}

        if(hm.containsKey(step)){
            return hm.get(step);
        }

        int ans =  cost[step]+ Math.min(climb(step+1),climb(step+2));
        this.hm.put(step,ans);
        return ans;
    }
}
