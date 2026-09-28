class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int temp =0;
        for(int p : piles){
           temp=  Math.max(temp, p);
        }
        int r =temp;
        int l =1;
        int mid = 0;
        while(l<r){
        mid = l + (r-l)/2;
        if(eat(mid, piles)>h){
            l = mid+1;        }
        else if(eat(mid,piles)<=h){
                r = mid;
        }
        }
        return l;
    }


     int eat(int k, int[] piles) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; 
        }
        return hours;
    }
}
