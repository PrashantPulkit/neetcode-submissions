class CacheItem{
    int key;
    int value;
    int freq;
    int time;
    public CacheItem(int k, int v, int f, int t){
    this.key= k;
    this.value=v;
    this.freq=f;
    this.time=t;
    }
}
class LFUCache {
    int capacity;
    int time = 0;
    HashMap<Integer, CacheItem> cache = new HashMap<>();
    PriorityQueue<CacheItem> lfu = new PriorityQueue<>((a, b) -> {
        if (a.freq != b.freq) {
            return a.freq - b.freq;
        }
        return a.time - b.time;
    });
    public LFUCache(int capacity) {
    this.capacity= capacity;
    }
    
    public int get(int key) {
        time++;
        CacheItem c = this.cache.getOrDefault(key,null);
        if(c == null){
            return -1;
        }
        this.lfu.remove(c);
        c.freq++;
        c.time = this.time;
        this.lfu.offer(c);
        return c.value;
        
    }
    
    public void put(int key, int value) {
        time++;
        if(this.cache.size() < this.capacity ){
            
        }else{
            CacheItem c = this.lfu.remove();
            this.cache.remove(c.key);
        }
        this.cache.put(key, new CacheItem(key, value,1,this.time));
        this.lfu.offer(this.cache.get(key));
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */