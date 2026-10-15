class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        for(int i =0 ; i<nums.length+1;i++){
            if(!hs.contains(i)){
                return i;
            }
            
        }
        return nums[nums.length-1]+1;
    }
}
