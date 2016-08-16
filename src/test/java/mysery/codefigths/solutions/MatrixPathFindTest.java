/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class MatrixPathFindTest {

    @Test
    public void testFindPath() {
        MatrixPathFind instance = new MatrixPathFind();
        int[][] matrix = new int[][]{{1,4,5},{2,3,6}};
        boolean expResult = true;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{1,3,6},{2,4,5}};
        expResult = false;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{1,2,3},{6,5,4},{7,8,9},{12,11,10}};
        expResult = true;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{5,4,3,2,1}};
        expResult = true;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{2,3,4,5},{1,8,7,6},{12,9,10,11}};
        expResult = false;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{}};
        expResult = false;
        assertEquals(expResult, instance.findPath(matrix));
        matrix = new int[][]{{},{}};
        expResult = false;
        assertEquals(expResult, instance.findPath(matrix));
        //matrix = new int[][]{{1},{3}};
        //expResult = false;
        //assertEquals(expResult, instance.findPath(matrix));
        //matrix = new int[][]{{1},{2}};
        //expResult = true;
        //assertEquals(expResult, instance.findPath(matrix));
    }

}
