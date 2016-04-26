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
public class FrogRiverOneTest {
    
    public FrogRiverOneTest() {
    }

    /**
     * Test of solution method, of class FrogRiverOne.
     */
    @Test
    public void testSolution() {
        int X = 5;
        int[] A = new int[]{1,3,1,4,2,3,5,4};
        FrogRiverOne instance = new FrogRiverOne();
        int expResult = 6;
        int result = instance.solution(X, A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolution1() {
        int X = 1;
        int[] A = new int[]{1,3,1,4,2,3,5,4};
        FrogRiverOne instance = new FrogRiverOne();
        int expResult = 0;
        int result = instance.solution(X, A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionNoResult() {
        int X = 6;
        int[] A = new int[]{1,3,1,4,2,3,5,4};
        FrogRiverOne instance = new FrogRiverOne();
        int expResult = -1;
        int result = instance.solution(X, A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionOneSolve() {
        int X = 1;
        int[] A = new int[]{1};
        FrogRiverOne instance = new FrogRiverOne();
        int expResult = 0;
        int result = instance.solution(X, A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionOneNotSolve() {
        int X = 6;
        int[] A = new int[]{1};
        FrogRiverOne instance = new FrogRiverOne();
        int expResult = -1;
        int result = instance.solution(X, A);
        assertEquals(expResult, result);
    }
    
}
