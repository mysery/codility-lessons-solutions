/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.macherprimeandfibonacci;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class FibonacciGeneratorTest {
    
    public FibonacciGeneratorTest() {
    }

    /**
     * Test of next method, of class FibonacciGenerator.
     */
    @Test
    public void testNext() {
        FibonacciGenerator instance = new FibonacciGenerator();
        assertThat(instance.next(), is(0));
        assertThat(instance.next(), is(1));
        assertThat(instance.next(), is(1));
        assertThat(instance.next(), is(2));
        assertThat(instance.next(), is(3));
        assertThat(instance.next(), is(5));
        assertThat(instance.next(), is(8));
        assertThat(instance.next(), is(13));
        assertThat(instance.next(), is(21));
        assertThat(instance.next(), is(34));
        assertThat(instance.next(), is(55));
        assertThat(instance.next(), is(89));
        assertThat(instance.next(), is(144));
        assertThat(instance.next(), is(233));
        assertThat(instance.next(), is(377));
    }
    
}
