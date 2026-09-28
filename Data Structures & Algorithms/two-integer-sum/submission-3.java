class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
    for( i=0;i<nums.length-1;i++){
    for( j = i;j<nums.length-1;j++){
    if(nums[i]+nums[j]==target && i != j){
        break;
        
    }

    }
    if(nums[i]+nums[j]==target && i != j){
        break;}
    }
    int[] result ={i,j};
    return result;  
    }
}
