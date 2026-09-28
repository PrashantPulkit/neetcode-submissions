class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        if(nums.length==1){
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> ans2 = new ArrayList<>();
            ans2.add(nums[0]);
            ans.add(ans2);
            return ans;
        }else{
            List<List<Integer>> perms = permute(Arrays.copyOfRange(nums, 1, nums.length ));
            List<List<Integer>> perms2= new ArrayList<>();
            for(List<Integer> perm : perms){
                  for(int i =0;i<=perm.size();i++){
                    List<Integer> pcopy = new ArrayList<>(perm);
                    pcopy.add(i,nums[0]);
                    perms2.add(pcopy);
                  }
            }
            return perms2;
        }
    }
}
