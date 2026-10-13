class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] needed = new int[1001];
        for(int[] trip :trips){
            for(int i =trip[1];i<trip[2];i++){
                needed[i] +=trip[0]; 
            }
        }
        for(int n : needed){
       if(n>capacity){
        return false;
       }
        }
        return true;
    }
}