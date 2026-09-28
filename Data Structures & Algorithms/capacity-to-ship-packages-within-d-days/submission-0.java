class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int cub=0;
        int clb=0;
        for(int weight : weights){
            cub+=weight;
            if (weight > clb) clb = weight;
        }


        int mid =0;
        int ans = cub;
        while(clb<=cub){
            mid= clb+((cub-clb)/2);
            int days2 =0;
            int temp =0;
            for(int w:weights){
                if (temp+w >mid){
                    temp = 0 ;
                    days2+=1;
                }
                
                    temp= temp+w;

            }
            if(temp!=0){
                days2+=1;
            }

            if(days2>days){
                clb =mid+1;
            }
            if(days2<=days){
                ans = mid;
                cub=mid-1;
            }
        }
        return ans;
    }
}