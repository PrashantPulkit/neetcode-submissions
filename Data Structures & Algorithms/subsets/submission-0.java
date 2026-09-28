class Solution {
    int[] nums;
    List<List<Integer>>  sub = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
    this.nums = nums;
    find(new ArrayList<Integer>(),0);
        return sub;
    }
    void find(ArrayList a, int i){
           if(i==nums.length){
            sub.add(new ArrayList<>(a));
            return;
           }
            find(a,i+1);
            a.add(nums[i]);
            find(a,i+1);
            a.remove(a.size() - 1);

           
        
    }
}
