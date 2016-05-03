/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class StringAnagramTest {

    public StringAnagramTest() {
    }

    /**
     * Test of isAnagram method, of class StringAnagram.
     */
    @Test
    public void testIsAnagram() {
        assertTrue(StringAnagram.isAnagram("word", "wrdo"));
        assertTrue(StringAnagram.isAnagram("mary", "army"));
        assertTrue(StringAnagram.isAnagram("stop", "tops"));
        assertTrue(StringAnagram.isAnagram("boat", "btoa"));
        assertFalse(StringAnagram.isAnagram("pure", "in"));
        assertFalse(StringAnagram.isAnagram("fill", "fil"));
        assertFalse(StringAnagram.isAnagram("b", "bbb"));
        assertFalse(StringAnagram.isAnagram("ccc", "ccccccc"));
        assertTrue(StringAnagram.isAnagram("a", "a"));
        assertFalse(StringAnagram.isAnagram("sleep", "slep"));
        assertFalse(StringAnagram.isAnagram("fill", "nooo"));
        assertFalse(StringAnagram.isAnagram("ffff", "aaaa"));
        assertFalse(StringAnagram.isAnagram("fafa", "aaaa"));
        assertFalse(StringAnagram.isAnagram("ohoho", "hahah"));
        assertTrue(StringAnagram.isAnagram("ohoho", "ohoho"));//ohoh and ohho will fail.
    }
    
    @Test
    public void testAnAnagram() {
        assertTrue(StringAnagram.anAnagram("word", "wrdo"));
        assertTrue(StringAnagram.anAnagram("mary", "army"));
        assertTrue(StringAnagram.anAnagram("stop", "tops"));
        assertTrue(StringAnagram.anAnagram("boat", "btoa"));
        assertFalse(StringAnagram.anAnagram("pure", "in"));
        assertFalse(StringAnagram.anAnagram("fill", "fil"));
        assertFalse(StringAnagram.anAnagram("b", "bbb"));
        assertFalse(StringAnagram.anAnagram("ccc", "ccccccc"));
        assertTrue(StringAnagram.anAnagram("a", "a"));
        assertFalse(StringAnagram.anAnagram("sleep", "slep"));
        assertFalse(StringAnagram.anAnagram("fill", "nooo"));
        assertFalse(StringAnagram.anAnagram("ffff", "aaaa"));
        assertFalse(StringAnagram.anAnagram("fafa", "aaaa"));
        assertFalse(StringAnagram.anAnagram("ohoho", "hahah"));
        assertTrue(StringAnagram.anAnagram("ohoh", "hoho"));
    }
}
