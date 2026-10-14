class MyStack {
    Queue<Integer> main = new ArrayDeque<>();
    Queue<Integer> temp = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        main.offer(x);
    }
    
    public int pop() {
        while(main.size()>1){temp.offer(main.poll());}
        int ans = main.poll();
          while(temp.size()>0){
        main.offer(temp.poll());}
        return ans;

    }
    
    public int top() {
        while(main.size()>1){temp.offer(main.poll());}
        int ans = main.peek();
        temp.offer(main.poll());
        while(temp.size()>0){
        main.offer(temp.poll());
        }
        return ans;
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */