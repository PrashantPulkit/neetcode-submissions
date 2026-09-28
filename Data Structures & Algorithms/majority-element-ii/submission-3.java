class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(h.containsKey((Integer)nums[i])){
                h.put(nums[i],h.get(nums[i])+1);
            }
            else{
                h.put(nums[i],1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        
        Set<Integer> keys = h.keySet();
        for(int i:keys){
            if(h.get(i)>(int)nums.length/3){
             ans.add(i);
             
            }
        }
        return ans;
    }
}