package mysery.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import mysery.collections.hash.DataHasher;

/**
 * @author
 * http://www.javamex.com/tutorials/collections/64_bit_hash_map_implementation.shtml
 */
public class CompactMap<E> {
    private int[] table;
    private int[] nextPtrs;
    private long[] hashValues;
    private E[] elements;
    private int nextHashValuePos;
    private int hashMask;
    private int size = 0;

    public CompactMap(int maxElements) {
        int sz = 128;
        int desiredTableSize = maxElements * 4 / 3;
        while (sz < desiredTableSize) {
            sz <<= 1;
        }
        this.table = new int[sz];
        this.nextPtrs = new int[maxElements];
        this.hashValues = new long[maxElements];
        this.elements = (E[]) new Object[sz];
        Arrays.fill(table, -1);
        this.hashMask = sz - 1;
    }

    public E get(CharSequence key) {
        long hash = DataHasher.hashCode(key);
        int hc = (int) hash & hashMask;
        int k = table[hc];
        if (k != -1) {
            do {
                if (hashValues[k] == hash) {
                    return elements[k];
                }
                k = nextPtrs[k];
            } while (k != -1);
        }
        return null; // No value added at this bucket
    }

    public E put(CharSequence key, E val) {
        long hash = DataHasher.hashCode(key);
        int hc = (int) hash & hashMask;
        int k = table[hc];
        if (k == -1) {
            // Start a new bucket: none there before
            k = nextHashValuePos++;
            table[hc] = k;
        } else {
            // traverse the bucket, looking for a matching hash
            int lastk;
            do {
                if (hashValues[k] == hash) {
                    E old = elements[k];
                    elements[k] = val;
                    return old;
                }
                lastk = k;
                k = nextPtrs[k];
            } while (k != -1);
            // ... if not there, append to end of bucket
            k = nextHashValuePos++;
            nextPtrs[lastk] = k;
        }
        // Append value, either to end of bucket or
        // to start of new bucket
        hashValues[k] = hash;
        nextPtrs[k] = -1;
        elements[k] = val;
        size++;
        return null;
    }
}
