package mysery.interview.coderPad;

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named LRUCacheLinkedHashMap.
 *
 * If you need more classes, simply define them inline.
 */
//Design a "LRU" Cache with get and set methods.
public class LRUCacheLinkedHashMap {

    private int capacity;
    private static final float hashTableLoadFactor = 0.75f;
    LinkedHashMap<String, String> map;

    public LRUCacheLinkedHashMap(int cacheSize) {
        this.capacity = cacheSize;
        map = new LinkedHashMap(capacity, hashTableLoadFactor, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity; 
            }
        };
    }

    public String get(String key) {
        return map.get(key);
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public int size() {
        return map.size();
    }
}
