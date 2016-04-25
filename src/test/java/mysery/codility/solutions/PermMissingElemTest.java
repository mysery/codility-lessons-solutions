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
public class PermMissingElemTest {

    public PermMissingElemTest() {
    }

    /**
     * Test of solution method, of class PermMissingElem.
     */
    @Test
    public void testSolution() {
        int[] A = new int[]{2, 3, 1, 5};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 4;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOrder() {
        int[] A = new int[]{1, 2, 3, 5};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 4;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionLast() {
        int[] A = new int[]{1, 2, 3, 4};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 5;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolution2() {
        int[] A = new int[]{2, 3, 1, 5};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 4;
        int result = instance.solution2(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionOrder2() {
        int[] A = new int[]{1, 2, 3, 5};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 4;
        int result = instance.solution2(A);
        assertEquals(expResult, result);
    }

    @Test
    public void testSolutionLast2() {
        int[] A = new int[]{1, 2, 3, 4};
        PermMissingElem instance = new PermMissingElem();
        int expResult = 5;
        int result = instance.solution2(A);
        assertEquals(expResult, result);
    }

    @Test()
    public void testSolution210k() {
        int[] A = new int[100000];
        for (int i = 1; i <= 100000; i++) {
            A[i - 1] = i;
        }
        PermMissingElem instance = new PermMissingElem();
        int expResult = 100001;
        System.out.println("Starting test testSolution210k");
        long time = System.currentTimeMillis();
        int result = instance.solution2(A);
        time = System.currentTimeMillis() - time;
        System.out.println(" The test took " + time + " milliseconds");
        assertEquals(expResult, result);
    }

    @Test()
    public void testSolution10k() {
        int[] A = new int[100000];
        for (int i = 1; i <= 100000; i++) {
            A[i - 1] = i;
        }
        PermMissingElem instance = new PermMissingElem();
        int expResult = 100001;
        System.out.println("Starting test testSolution10k");
        long time = System.currentTimeMillis();
        int result = instance.solution(A);
        time = System.currentTimeMillis() - time;
        System.out.println(" The test took " + time + " milliseconds");
        assertEquals(expResult, result);
    }
    
    @Test()
    public void testSolution210first() {
        int[] A = new int[100000];
        for (int i = 0; i < 100000; i++) {
            A[i] = i+2;
        }
        PermMissingElem instance = new PermMissingElem();
        int expResult = 1;
        System.out.println("Starting test testSolution210first");
        long time = System.currentTimeMillis();
        int result = instance.solution2(A);
        time = System.currentTimeMillis() - time;
        System.out.println(" The test took " + time + " milliseconds");
        assertEquals(expResult, result);
    }
}
