/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import org.hamcrest.Matchers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class StringPermutationsTest {

    public StringPermutationsTest() {
    }

    /**
     * Test of permutations method, of class StringPermutations.
     */
    @Test
    public void testPermutations() {
        String word = "XYZ";
        StringPermutations instance = new StringPermutations();
        List<String> expResult = Arrays.asList("XYZ", "XZY", "YZX", "YXZ", "ZXY", "ZYX");
        List<String> result = instance.permutations(word);
        assertThat(result, Matchers.containsInAnyOrder(expResult.toArray(new String[expResult.size()])));
    }

    @Test
    public void testPermutationsOne() {
        String word = "X";
        StringPermutations instance = new StringPermutations();
        List<String> expResult = Arrays.asList("X");
        List<String> result = instance.permutations(word);
        assertEquals(expResult, result);
    }

    @Test
    public void testPermutationsTwo() {
        String word = "XY";
        StringPermutations instance = new StringPermutations();
        List<String> expResult = Arrays.asList("YX", "XY");
        List<String> result = instance.permutations(word);
        assertThat(result, Matchers.containsInAnyOrder(expResult.toArray(new String[expResult.size()])));
    }

    @Test
    public void testPermutationsTwoRepeat() {
        String word = "XX";
        StringPermutations instance = new StringPermutations();
        List<String> expResult = Arrays.asList("XX", "XX");
        List<String> result = instance.permutations(word);
        assertThat(result, Matchers.containsInAnyOrder(expResult.toArray(new String[expResult.size()])));
    }
}
