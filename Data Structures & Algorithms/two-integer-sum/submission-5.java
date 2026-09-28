class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            hm.put(nums[i],i);
        }
        for(int i =0; i< nums.length;i++){
            if(hm.containsKey(target- nums[i])){
                if(hm.get(target-nums[i])==i){
                    continue;
                }
                int[] a = {i,hm.get(target-nums[i])};
                return  a;
            }
        }
        return null;
    } 
}
