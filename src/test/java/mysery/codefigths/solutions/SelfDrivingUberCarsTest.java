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
public class SelfDrivingUberCarsTest {
    
    /**
     * Test of crossroads method, of class SelfDrivingUberCars.
     */
    @Test
    public void testCrossroads1() {
        int[] road1 = new int[]{1, 5, 6, 7};
        int[] road2 = new int[]{3, 10};
        int crossTime = 2;
        SelfDrivingUberCars instance = new SelfDrivingUberCars();
        boolean expResult = false;
        boolean result = instance.crossroads(road1, road2, crossTime);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrossroads2() {
        int[] road1 = new int[]{2};
        int[] road2 = new int[]{3};
        int crossTime = 2;
        SelfDrivingUberCars instance = new SelfDrivingUberCars();
        boolean expResult = true;
        boolean result = instance.crossroads(road1, road2, crossTime);
        assertEquals(expResult, result);
    }
    
}
