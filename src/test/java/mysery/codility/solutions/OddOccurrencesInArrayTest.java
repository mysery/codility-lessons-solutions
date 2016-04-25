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
public class OddOccurrencesInArrayTest {
    
    public OddOccurrencesInArrayTest() {
    }

    /**
     * Test of solution method, of class OddOccurrencesInArray.
     */
    @Test
    public void testSolution() {
        int[] A = {3,7,5,1,3,10,1,5,7};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 10;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolution1() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 7;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionOne() {
        int[] A = {9};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 9;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionTree() {
        int[] A = {9,7,9};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 7;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionEmpty() {
        int[] A = {};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = -1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionPar() {
        int[] A = {9,7};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = -1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionEquals() {
        int[] A = {9,9,9};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 9;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionN11() {
        int[] A = {4,4,4,4,1,1,1,4,4,4,4};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSolutionEquals7() {
        int[] A = {9,9,9,9,9,9,7};
        OddOccurrencesInArray instance = new OddOccurrencesInArray();
        int expResult = 7;
        int result = instance.solution(A);
        assertEquals(expResult, result);
    }
  
    
}
