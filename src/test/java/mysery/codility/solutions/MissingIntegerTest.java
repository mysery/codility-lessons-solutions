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
    /**
     * Test of solution method, of class MissingInteger.
     */
    @Test
    public void testSolutionMax() {
        int[] A = new int[]{1,3,6,4,1,546};
        MissingInteger instance = new MissingInteger();
        int expResult = 2;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionrepeat() {
        int[] A = new int[]{1,1,1,1,5,5,5,3,3,3,4,4,4};
        MissingInteger instance = new MissingInteger();
        int expResult = 2;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of solution method, of class MissingInteger.
     */
    @Test
    public void testSolutionBitSet() {
        int[] A = new int[]{1,3,6,4,1,2};
        MissingInteger instance = new MissingInteger();
        int expResult = 5;
        int result = instance.solutionBitSet(A);
        assertEquals(expResult, result);
    }
    /**
     * Test of solution method, of class MissingInteger.
     */
    @Test
    public void testSolutionMaxBitSet() {
        int[] A = new int[]{1,3,6,4,1,546};
        MissingInteger instance = new MissingInteger();
        int expResult = 2;
        int result = instance.solutionBitSet(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionrepeatBitSet() {
        int[] A = new int[]{1,1,1,1,5,5,5,3,3,3,4,4,4};
        MissingInteger instance = new MissingInteger();
        int expResult = 2;
        int result = instance.solutionBitSet(A);
        assertEquals(expResult, result);
    }
    
    
    
}
