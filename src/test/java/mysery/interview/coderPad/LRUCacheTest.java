/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.coderPad;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class LRUCacheTest {
    
    public LRUCacheTest() {
    }

    /**
     * Test of get method, of class LRUCacheLinkedHashMap.
     */
    @Test
    public void testGet() {
        LRUCacheLinkedHashMap c = new LRUCacheLinkedHashMap(3);
        c.put ("1", "one");                           // 1
        c.put ("2", "two");                           // 2 1
        c.put ("3", "three");                         // 3 2 1
        c.put ("4", "four");                          // 4 3 2
        assertNotNull(c.get("2")); // 2 4 3
        c.put ("5", "five");                          // 5 2 4
        c.put ("4", "second four");                   // 4 5 2
        // Verify cache content.
        assertTrue(c.size()==3);
        assertEquals(c.get("4"), "second four");
        assertEquals(c.get("5"), "five");
        assertEquals(c.get("2"), "two");
        c.put ("4", "third four");                   // 5 2 4
        assertEquals(c.get("4"), "third four");
        assertEquals(c.get("5"), "five");
        c.put ("1", "second one");                   // 5 4 1
        assertNull(c.get("2"));
    }
    
    /**
     * Test of get method, of class LRUCacheNodeList.
     */
    @Test
    public void testLRUCacheNodeListTest() {
        LRUCacheNodeList c = new LRUCacheNodeList(3);
        c.put ("1", "one");                           // 1
        c.put ("2", "two");                           // 2 1
        c.put ("3", "three");                         // 3 2 1
        c.put ("4", "four");                          // 4 3 2
        assertNotNull(c.get("2")); // 2 4 3
        c.put ("5", "five");                          // 5 2 4
        c.put ("4", "second four");                   // 4 5 2
        // Verify cache content.
        assertTrue(c.size()==3);
        assertEquals(c.get("4"), "second four");
        assertEquals(c.get("5"), "five");
        assertEquals(c.get("2"), "two");
        c.put ("4", "third four");                   // 5 2 4
        assertEquals(c.get("4"), "third four");
        assertEquals(c.get("5"), "five");
        c.put ("1", "second one");                   // 5 4 1
        assertNull(c.get("2"));
    }
    
}
