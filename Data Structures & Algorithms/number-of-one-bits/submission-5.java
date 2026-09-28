class Solution {
    public int hammingWeight(int n) {
        int count =0;
        int one = 1;
     while(n!=0){
        if((n & one )==1){
            count++;
        }
        n>>=1;
      }
      return count;
    }
}
