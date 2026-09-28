class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
         for (int num : nums) {
            h.add(num);
        }


        int longest=0;
        for(int num : nums){
            if(!(h.contains(num-1))){
                int length = 1;
                while(true){
                    if(h.contains(num+length)){
                        length++;
                    }
                    else{
                        break;
                    }
                }
                if(length>=longest){
                    longest = length;
                }
            }
        }
        return longest;
         
    }
}
