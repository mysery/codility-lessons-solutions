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
public class MissingIntegerTest {
    
    public MissingIntegerTest() {
    }

    /**
     * Test of solution method, of class MissingInteger.
     */
    @Test
    public void testSolution() {
        int[] A = new int[]{1,3,6,4,1,2};
        MissingInteger instance = new MissingInteger();
        int expResult = 5;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
}
