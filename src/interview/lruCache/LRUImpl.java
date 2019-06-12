package interview.lruCache;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


//O(n) time complexity
public class LRUImpl {
    int capacity;
    Map<Integer, Integer> map;

    LRUImpl(int c) {
        this.capacity = c;
        map = new LinkedHashMap<>();
    }

    //check if the value exists

    public static void main(String[] args) {
        LRUImpl lru = new LRUImpl(4);

        lru.getValue(3);

    }

    private int getValue(int key) {
        Integer val = map.get(key);
        if (val == null) {
            return -1;
        } else {
            setValue(key, val);
        }
        return val;
    }

    private void setValue(int key, int val) {
        if (map.containsKey(key)) {
            map.remove(key);
        } else if (map.size() == capacity) {
            Iterator<Integer> it = map.keySet().iterator();
            it.next();
            it.remove();
        }
        map.put(key, val);
    }
}
