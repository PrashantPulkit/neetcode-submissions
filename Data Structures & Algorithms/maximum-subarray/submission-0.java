class Solution {
    public int maxSubArray(int[] nums) {
        int max =0;
        int currentSum =0;
        for(int num : nums){
            currentSum += num;
            if(max<currentSum | max==0){
                max= currentSum;
            }
            if (currentSum<0){
currentSum =0;
            } 

        }
        return max;
    }
}
