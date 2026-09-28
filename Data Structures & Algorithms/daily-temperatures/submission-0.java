class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] values = new int[temperatures.length];
        stack.push(0);
        for(int i =1 ; i<temperatures.length; i++){
            if( !stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                
                int index=0;
                while( !stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                     
                     index = stack.pop();
                     values[index] = i-index;
                     
                }
                stack.push(i);
            }else{
            stack.push(i);
            }
        }
return values;
        
    }
}
