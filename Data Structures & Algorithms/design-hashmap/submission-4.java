class MyHashMap {
    int[] hm = new int[1000000];
    int[] hm2 = new int[1];
    public MyHashMap() {
        Arrays.fill(hm,-1);
    }
    
    public void put(int key, int value) {
        if (key==1000000){
            hm2[0] = value;
        }
        else{
            hm[key] = value;
        }
        
    }
    
    public int get(int key) {
        if (key==1000000){
           return hm2[0];
        }
        else{
            return hm[key];
        }
       
    }
    
    public void remove(int key) {
        if (key==1000000){
           hm2[0] = -1;
        }
        else{
             hm[key]= -1;
        }
       
    }
       
    }


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */