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
public class ReduceDirectionsTest {

    @Test
    public void testReduceDirections() {
        System.out.println("ReduceDirections");
        String[] ds = new String[]{"NORTH",
            "SOUTH",
            "SOUTH",
            "EAST",
            "WEST",
            "NORTH",
            "WEST"};
        ReduceDirections instance = new ReduceDirections();
        String[] expResult = new String[]{"WEST"};
        String[] result = instance.ReduceDirections(ds);
        assertArrayEquals(expResult, result);
    }

}
