//LRU cache
class Prob146 {
     //Variable to store maximum number of items the cache can hold.
    int capacity;
    
    //linked hashmap to maintain insertion order
    //internally-doubly linked list is used
    LinkedHashMap<Integer, Integer> dic;

//Constructor — runs when an LRUCache object is created.
    public LRUCache(int capacity) 
    {
       
        this.capacity = capacity;

        //anonymous class
        dic = new LinkedHashMap<>(5, 0.75f, true)
        //5=initial capacity-Just an initial bucket size (not the actual cache size limit).
        //0.75f-=load factor-meaning when 75% full, it resizes internally.
        //true=access order-it means the order of elements will be based on access, not insertion.
        //So when you get() or put() a key, it moves to the end of the map — marking it as most recently used.
         {
            @Override
            /*removeEldestEntry() is an inbuilt method in Java’s LinkedHashMap class — but it’s a protected method, which means you can override it when you create your own subclass (or an anonymous subclass*/

            //automatically called after each insertion (put()) call
            //eldest means the first (oldest) entry in the insertion or access order of the LinkedHashMap.
            protected boolean removeEldestEntry(
                Map.Entry<Integer, Integer> eldest
            ) {
                return dic.size() > capacity;
            }
        };
    }

//If key exists, return its value; else return -1.
//Also, since accessOrder = true, this moves the accessed key to the end (marking it as recently used).
    public int get(int key) {
        return dic.getOrDefault(key, -1);
    }

/*Inserts the key-value pair into the map.
If the key already exists, it updates it and moves it to the end (recently used).
If the cache exceeds capacity, the overridden method will auto-remove the least recently used entry.*/ 
    public void put(int key, int value) {
        dic.put(key, value);
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
