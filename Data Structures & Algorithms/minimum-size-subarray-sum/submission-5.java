class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l =0, r=0, currSum =0, size =nums.length+1, currSize=0;
        while(l<=r && r<nums.length){
            currSum+=nums[r];
            currSize++;
            if(currSum >= target){
                size = Math.min(size,currSize);
                while(currSum >= target && l<r){
                    currSum-=nums[l];
                    currSize--;
                    if(currSum >= target){size = Math.min(size,currSize);}
                    l++;
                }
            }
            r++;
        }
        return size == nums.length+1 ? 0 : size;

    }
}