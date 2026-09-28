class Solution {
    public int subarraySum(int[] nums, int k) {
        for(int i =1;i<nums.length;i++){
           nums[i] = nums[i]+ nums[i-1];
        }
        int count = 0;
        
         HashMap<Integer,Integer> seen = new HashMap();
         seen.put(0,1);
         for(int i =0; i<nums.length;i++){
            if(seen.containsKey(nums[i]-k)){
                count += seen.get(nums[i]-k);
                    
            }

            if(seen.containsKey(nums[i])){seen.put(nums[i],seen.get(nums[i])+1);} else{
            seen.put(nums[i],1);
            }
         }
         return count;
    }
}