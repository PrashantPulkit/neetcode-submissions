class MyHashSet {
    private int[] MySet= new int[1000000];
    public MyHashSet() {
    Arrays.fill(MySet, -1);
    }
    
    public void add(int key) {
       
        this.MySet[key]= key;
        
    }
    
    public void remove(int key) { 
        this.MySet[key]= -1;
    }
    
    public boolean contains(int key) {
        if(this.MySet[key]==key){
            return true;
        }
        else{
            return false;
        }
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */