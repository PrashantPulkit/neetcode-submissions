class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i =0 ;i<=nums.length-1;i++){
            for(int j =1;j<=k ;j++){
                try{if(nums[i]==nums[i+j]){
                    return true;
                }}
                catch(Exception e){
                    continue;
                }
                
            }
        }
        return false;
    }
}