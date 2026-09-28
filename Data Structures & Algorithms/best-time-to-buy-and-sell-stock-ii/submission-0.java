class Solution {
    public int maxProfit(int[] prices) {
       boolean hold = false;
       int profit=0;
       for(int i=0 ; i<prices.length;i++){
        if(hold){
            profit+= prices[i]-prices[i-1];
            hold = false;
        }
        try{ if (prices[i+1]>prices[i]&& !hold ){
                hold = true;
        }
        }catch(Exception e){
            break;
        }
       }
       return profit;
    }
}