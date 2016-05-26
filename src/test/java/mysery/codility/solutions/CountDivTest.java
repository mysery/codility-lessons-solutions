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
public class CountDivTest {

    public CountDivTest() {
    }

    /**
     * Test of solution method, of class CountDiv.
     */
    @Test
    public void testSolution() {
        int A = 6;
        int B = 11;
        int K = 2;
        CountDiv instance = new CountDiv();
        int expResult = 3;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolution2() {
        int A = 1;
        int B = 1;
        int K = 11;
        CountDiv instance = new CountDiv();
        int expResult = 0;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolution3() {
        int A = 10;
        int B = 10;
        int K = 5;
        CountDiv instance = new CountDiv();
        int expResult = 1;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }

    @Test(timeout = 800L)
    public void testSolutionPerformance() {
        int A = 0;
        int B = Integer.MAX_VALUE;
        int K = Integer.MAX_VALUE;
        CountDiv instance = new CountDiv();
        int expResult = 1;
        int result = instance.solution(A, B, K);
        assertEquals(expResult, result);
    }

}
