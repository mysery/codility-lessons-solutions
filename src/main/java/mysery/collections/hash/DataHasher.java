/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.collections.hash;

/**
 * @author
 * http://www.javamex.com/tutorials/collections/strong_hash_code_implementation.shtml
 */
public class DataHasher {

    private static final long[] byteTable = createLookupTable();
    private static final long HSTART = 0xBB40E64DA205B064L;
    private static final long HMULT = 7664345821815920749L;

    private static long[] createLookupTable() {
        long[] bTable = new long[256];
        long h = 0x544B2FBACAAF1684L;
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 31; j++) {
                h = (h >>> 7) ^ h;
                h = (h << 11) ^ h;
                h = (h >>> 10) ^ h;
            }
            bTable[i] = h;
        }
        return bTable;
    }

    public static long hashCode(byte[] data) {
        long h = HSTART;
        final long hmult = HMULT;
        final long[] ht = byteTable;
        for (int len = data.length, i = 0; i < len; i++) {
            h = (h * hmult) ^ ht[data[i] & 0xff];
        }
        return h;
    }

    public static long hashCode(CharSequence cs) {
        long h = HSTART;
        final long hmult = HMULT;
        final long[] ht = byteTable;
        final int len = cs.length();
        for (int i = 0; i < len; i++) {
            char ch = cs.charAt(i);
            h = (h * hmult) ^ ht[ch & 0xff];
            h = (h * hmult) ^ ht[(ch >>> 8) & 0xff];
        }
        return h;
    }
}
