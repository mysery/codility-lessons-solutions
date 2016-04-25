/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import mysery.codility.solutions.CyclicRotation;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class CyclicRotationTest {
    
    @Test
    public void testSolution3() {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {9, 7, 6, 3, 8};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testSolution1() {
        int[] A = {3, 8, 9, 7, 6};
        int K = 1;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {6, 3, 8, 9, 7};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolution0() {
        int[] A = {3, 8, 9, 7, 6};
        int K = 0;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {3, 8, 9, 7, 6};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolution8() {
        int[] A = {3, 8, 9, 7, 6};
        int K = 8;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {9, 7, 6, 3, 8};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolutionEmpty() {
        int[] A = {};
        int K = 2;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testSolutionOne() {
        int[] A = {1};
        int K = 5;
        CyclicRotation instance = new CyclicRotation();
        int[] expResult = {1};
        int[] result = instance.solution(A, K);
        assertArrayEquals(expResult, result);
    }
    
}
