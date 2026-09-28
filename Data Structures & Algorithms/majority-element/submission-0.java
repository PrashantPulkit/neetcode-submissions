class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int num : nums){
            if(h.containsKey(num)){
            h.put(num,h.get(num)+1);
        
            }
            else{
            h.put(num,1);            }



        }
        int maxNum=0;
        int count=0;
        for(Integer entry : h.keySet()){
            if(h.get(entry)> count){
                count = h.get(entry);
                maxNum= entry;

            }
        }

        return maxNum;
    }
}