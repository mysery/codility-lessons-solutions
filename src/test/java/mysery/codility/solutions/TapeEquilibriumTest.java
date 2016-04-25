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
public class TapeEquilibriumTest {
    
    public TapeEquilibriumTest() {
    }

    /**
     * Test of solution method, of class TapeEquilibrium.
     */
    @Test
    public void testSolution() {
        int[] A = new int[]{3,1,2,4,3};
        TapeEquilibrium instance = new TapeEquilibrium();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
}
