class Solution {
    public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> h = new HashSet<>(); 
    for(int n: nums){
        if(h.contains(n)){
            return true;
        }else{
            h.add(n);
        }
    }
    return false;
    }
}