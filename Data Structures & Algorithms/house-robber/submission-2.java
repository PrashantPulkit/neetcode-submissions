class Solution {
    int[] nums;
    HashMap<Integer, Integer> hm = new HashMap<>();
    public int rob(int[] nums) {
        this.nums= nums;
        return Math.max(loot(0),loot(1));
    }
    private int loot(int house){
        if(house>= this.nums.length){ return 0; }
        if(house == nums.length-1){ return nums[nums.length-1] ;}

        if(hm.containsKey(house)){
            return hm.get(house);
        }

        int ans = nums[house] + Math.max(loot(house+2),loot(house+3));
        hm.put(house,ans);
        return ans;
    }
}
