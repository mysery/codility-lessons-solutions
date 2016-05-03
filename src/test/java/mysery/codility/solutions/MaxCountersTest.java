/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class MaxCountersTest {
    
    public MaxCountersTest() {
    }

    /**
     * Test of solution method, of class MaxCounters.
     */
    @Test
    public void testSolution() {
        int N = 5;
        int[] A = {3,4,4,6,1,4,4};
        MaxCounters instance = new MaxCounters();
        int[] expResult = {3, 2, 2, 4, 2};
        int[] result = instance.solution2(N, A);
        assertArrayEquals(expResult, result);
    }
    
    @Test(timeout=500)
    public void testSolutionT525() {
        int N = 10000;
        int[] A = new int[100000];
        Arrays.fill(A, (int) (Math.random() * (N*N)));
        MaxCounters instance = new MaxCounters();
        instance.solution2(N, A);
    }
   
    @Test(timeout=800)
    public void testSolutionT820() {
        int N = 100000;
        int[] A = new int[100000];
        Arrays.fill(A, 500000);
        MaxCounters instance = new MaxCounters();
        instance.solution2(N, A);
    }
    
}
