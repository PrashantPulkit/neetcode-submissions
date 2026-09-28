class Solution {
    public int[] sortArray(int[] nums) {
        int smallest=nums[0];
        int smallestIndex=0;
        int temp;
        for(int i = 0; i<nums.length-1;i++){
            for(int j = i; j<nums.length;j++ ){
                if(nums[j]<=smallest){
                    smallest = nums[j];
                    smallestIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = smallest;
            nums[smallestIndex]=temp;
            smallest = 50000;
        }
        return nums;
    }
}