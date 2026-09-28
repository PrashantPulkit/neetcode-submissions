class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int l,r ;
        for(int i =0 ;i<nums.length;i++){
        if (nums[i] > 0) break;
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        l=i+1;
        r=nums.length-1;
        while (l<r){
        if(nums[i]+nums[l]+nums[r]==0){
            res.add(Arrays.asList(nums[i],nums[r],nums[l]));
            l++;
            r--;
            while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
        }
        else if(nums[i]+nums[l]+nums[r]<0){
            l++;
        }
        else if(nums[i]+nums[l]+nums[r]>0){
            r--;
        }
        }
        }
        return res;
    }
}
