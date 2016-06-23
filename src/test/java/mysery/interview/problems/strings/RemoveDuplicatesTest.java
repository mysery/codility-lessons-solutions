/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.strings;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class RemoveDuplicatesTest {
  
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");

        assertEquals("absc", RemoveDuplicates.removeDuplicates("aabscs"));
        assertEquals("abcd", RemoveDuplicates.removeDuplicates("abcd"));
        assertEquals("a", RemoveDuplicates.removeDuplicates("aaaa"));
        assertEquals(null, RemoveDuplicates.removeDuplicates(null));
        assertEquals("", RemoveDuplicates.removeDuplicates(""));
        assertEquals("ab", RemoveDuplicates.removeDuplicates("aaabbb"));
        assertEquals("ab", RemoveDuplicates.removeDuplicates("abababa"));
        
    }
    
}
