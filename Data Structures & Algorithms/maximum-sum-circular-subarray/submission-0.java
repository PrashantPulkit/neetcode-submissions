class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int currMax=nums[0];
        int min=nums[0];
        int currMin=nums[0];
        int total=nums[0];
        for(int i=1; i<nums.length;i++){
            int n = nums[i];
            total+=n;
            currMax=Math.max(currMax+n,n);
            max=Math.max(currMax,max);
            currMin= Math.min(currMin+n,n);
            min=Math.min(currMin,min);

        }
        if(max<0){
            return max;
        }else if(min==total){
            return max;
        }else{
            return Math.max(max,total-min);
        }
    }
}