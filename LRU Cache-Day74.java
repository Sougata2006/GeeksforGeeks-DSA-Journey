class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
    private int capacity;
    private Map <Integer,Integer> cacheMap;
    private LinkedList <Integer> lruList;
    
    LRUCache(int cap) {
        // code here
        this.capacity = cap;
        this.cacheMap = new HashMap<>();
        this.lruList = new LinkedList<>();
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        // your code here
        if( !cacheMap.containsKey(key)){
            return -1;
        }
        lruList.remove(Integer.valueOf(key));
        lruList.addFirst(key);
        return cacheMap.get(key);
    }

    // Function for storing key-value pair.
    public void put(int key, int value) {
        // your code here
        if(cacheMap.containsKey(key)){
            cacheMap.put(key,value);
            lruList.remove(Integer.valueOf(key));
        }
        else{
            if(cacheMap.size() >= capacity){
                int leastUsedKey = lruList.removeLast();
                cacheMap.remove(leastUsedKey);
            }
            cacheMap.put(key,value);
        }
        lruList.addFirst(key);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
