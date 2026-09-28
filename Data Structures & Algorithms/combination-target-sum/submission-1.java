class Solution {
    List<List<Integer>> sub = new ArrayList<>();
    int[] nums;
    int target;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums= nums;
        this.target=target;
        if(nums.length==0){
            List<List<Integer>> ans = new ArrayList<>();
            return ans;
        }
        List<Integer> a = new ArrayList<>();
        
        add(a,0,0);
       
        return sub;
    }
    void add(List<Integer> path,int idx,int sum){
        if(idx==nums.length){
            return;
        }
  
        if(sum == target){
            sub.add(new ArrayList<>(path));
        }else if(sum<target){
            for(int i = idx; i < nums.length; i++) {
    if(sum + nums[i] <= target) {
        path.add(nums[i]);
        add(path, i, sum + nums[i]); // reuse allowed
        path.remove(path.size() - 1);
    }
}

          
           
        }else{
            return;
        }
        
    }
}
