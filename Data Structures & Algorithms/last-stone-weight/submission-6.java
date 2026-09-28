class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> largest =new PriorityQueue<Integer>((a, b) -> b - a);
        for(int s : stones){
            largest.offer(s);
        }
        int a=largest.peek();
        int b= largest.peek();
        while(largest.size()>1){
           a = largest.poll();
           b= largest.poll();
           if(a==b){
            continue;
           }else{
            largest.offer(a-b);
           }
        }
        if(largest.size()==1){
b= largest.peek();
        }else{
            return 0;
        }
        
       return b;
    }
}
