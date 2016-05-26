/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.groupby;

import mysery.interview.problems.groupby.Grouper;
import mysery.interview.problems.groupby.GroupBy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class GroupByTest {

    public GroupByTest() {
    }

    /**
     * Test of groupBy method, of class GroupBy.
     */
    @Test
    public void testGroupBy() {
        GroupBy instance = new GroupBy();
        List<String> c = Arrays.asList("mesa", "silla", "nota", "pera", "cinco", "hola", "la", "guitarra");
        Map expResult = new HashMap();
        expResult.put(2, Arrays.asList("la"));
        expResult.put(4, Arrays.asList("mesa", "nota", "pera", "hola"));
        expResult.put(5, Arrays.asList("silla", "cinco"));
        expResult.put(8, Arrays.asList("guitarra"));
        Map result = instance.groupBy(c, new Grouper<String, Integer>() {
            @Override
            public Integer assignGroup(String x) {
                return x.length();
            }
        });
        assertEquals(expResult, result);
    }

    /**
     * Test of groupBy method, of class GroupBy.
     */
    @Test

    public void testGroupBy2() {
        GroupBy instance = new GroupBy();
        List<Integer> c = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        Map expResult = new HashMap();
        expResult.put(0, Arrays.asList(0, 5, 10, 15));
        expResult.put(1, Arrays.asList(1, 6, 11, 16));
        expResult.put(2, Arrays.asList(2, 7, 12, 17));
        expResult.put(3, Arrays.asList(3, 8, 13, 18));
        expResult.put(4, Arrays.asList(4, 9, 14, 19));
        Map result = instance.groupBy(c, new Grouper<Integer, Integer>() {
            @Override
            public Integer assignGroup(Integer x) {
                return x%5;
            }
        });
        assertEquals(expResult, result);
    }

}
