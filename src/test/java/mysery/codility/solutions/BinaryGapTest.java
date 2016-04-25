/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import mysery.codility.solutions.BinaryGap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class BinaryGapTest {
    
    /**
     * Test of secuenceGap method, of class BinaryGap.
     */
    @Test
    public void testSecuenceGap() {
        BinaryGap instance = new BinaryGap();
        assertEquals(1, instance.secuenceGap(125));
        assertEquals(0, instance.secuenceGap(15));
        assertEquals(3, instance.secuenceGap(137));
        assertEquals(5, instance.secuenceGap(130));
        assertEquals(6, instance.secuenceGap(129));
        assertEquals(0, instance.secuenceGap(128));
        assertEquals(2, instance.secuenceGap(83));
        assertEquals(1, instance.secuenceGap(219));
    }
    
}
