class Solution {
    
    public int findTargetSumWays(int[] nums, int target) {
    
       return findTargetSumWays(nums,target,0);

    }
    public int findTargetSumWays(int[] nums, int target,int  i){
        int temp =0;
        if(i==nums.length-1){
        if(target-nums[i]==0 ){
            temp++;
        }
        if(target+nums[i]==0 ){
            temp++;
        }return temp;
        }
        temp+= findTargetSumWays(nums, target -nums[i],i+1);
        temp+= findTargetSumWays(nums, target +nums[i],i+1);
        return temp;
        
    }
}
