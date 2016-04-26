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
public class PermCheckTest {
    
    public PermCheckTest() {
    }

    /**
     * Test of solution method, of class PermCheck.
     */
    @Test
    public void testSolutionPermOk() {
        int[] A = new int[]{4,1,3,2};
        PermCheck instance = new PermCheck();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionPermOkOne() {
        int[] A = new int[]{1};
        PermCheck instance = new PermCheck();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionPermOkOrder() {
        int[] A = new int[]{1,2,3,4,5,6,7,8,9};
        PermCheck instance = new PermCheck();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    /**
     * Test of solution method, of class PermCheck.
     */
    @Test
    public void testSolutionPermFail() {
        int[] A = new int[]{4,1,3};
        PermCheck instance = new PermCheck();
        int expResult = 0;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionPermFailOne() {
        int[] A = new int[]{2};
        PermCheck instance = new PermCheck();
        int expResult = 0;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    @Test
    public void testSolutionPermFailOrder() {
        int[] A = new int[]{2,3,4,5,6,7,8,9};
        PermCheck instance = new PermCheck();
        int expResult = 0;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
}
