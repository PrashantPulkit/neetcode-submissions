class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int lb=1;
        int ub=0;
        for(int i :piles){
            if(i>ub){
                ub=i;
            
            }
        }
       int leastRate=ub;
       
        while(lb<=ub){
            int mid=lb+((ub-lb)/2);
            if(eat(mid,piles)>h){
                lb= mid + 1;
            }
            else{
                ub= mid - 1;
                if(mid<leastRate){
                    leastRate=mid;
                    
                }
            }
        }
        return leastRate;
    }
    private int eat(int rate, int[] piles){
        int hours=0;
        for(int p : piles){
            int pilehours = (p + rate - 1) / rate;
            hours+=pilehours;
            if (hours > 1000000000) return hours; // Optimization to prevent overflow
        }
        return hours;
    }
}