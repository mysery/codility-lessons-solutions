/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.collabedit;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class BiMapTest {
    
    /**
     * Test of put method, of class BiMap.
     */
    @Test
    public void testBiMap() {
        BiMap<String, String> instance = new BiMap<>();
        instance.put("keyA", "valA");
        instance.put("keyB", "valB");
        instance.put("keyC", "valC");
        instance.put("keyAA", "valA");
        instance.put("keyCC", "valC");
        
        assertEquals("valC", instance.getValue("keyC"));
        assertEquals("valC", instance.getValue("keyCC"));
        
        assertArrayEquals(new String[]{"keyC", "keyCC"}, instance.getKeys("valC").toArray(new String[]{}));
        
        instance.remove("keyC");
        assertEquals("valC", instance.getValue("keyCC"));
        assertArrayEquals(new String[]{"keyCC"}, instance.getKeys("valC").toArray(new String[]{}));
        instance.remove("keyCC");
        assertEquals(null, instance.getValue("keyCC"));
        assertEquals(null, instance.getKeys("valC"));
        
        instance.removeValue("valA");
        assertEquals(null, instance.getValue("keyA"));
        assertEquals(null, instance.getValue("keyAA"));
        assertEquals(null, instance.getKeys("valA"));
        
    }
    
}
