class Solution {
    public void sortColors(int[] nums) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int num : nums){
        if(hm.containsKey(num)){
            hm.put((Integer)num,(Integer)(hm.get(num)+1));

        }
        else{
            hm.put(num,1);
        }
       }  
       int a = 0;   
       for(int i =0;i<3;i++){
        if(hm.containsKey(i)){
        for(int j =0; j < hm.get(i);j++){
           nums[a] = i;
           a++; 
        }}
       }
        
    }
}