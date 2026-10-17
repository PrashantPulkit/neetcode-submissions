class Solution {
    int[] nums;
    int target;
    public boolean canPartition(int[] nums) {
        this.nums = nums;
        int total=0;
     
        for(int n: nums){
            total+=n;
        }
         if(total%2!=0){
            return false;
        }else{
        this.target = total/2;
        if(dp(0,0) || dp(1,0)){
            return true;
        }else{
            return false;

        }
        }
        

    }
    private boolean dp(int i,int sum){
        if(i>=this.nums.length){
            return false;
        }
        sum+=this.nums[i];
        if(sum== this.target){
         return true;
        }else if(sum<this.target){
            return dp(i+1,sum) || dp(i+2,sum);
        }else{
            return false;
        }
    }
}
