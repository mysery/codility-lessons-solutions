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
public class PrimeGeneratorTest {
    
    @Test
    public void testNext() {
        PrimeGenerator instance = new PrimeGenerator();
        assertThat(instance.next(), is(1));
        assertThat(instance.next(), is(2));
        assertThat(instance.next(), is(3));
        assertThat(instance.next(), is(5));
        assertThat(instance.next(), is(7));
        assertThat(instance.next(), is(11));
        assertThat(instance.next(), is(13));
        assertThat(instance.next(), is(17));
        assertThat(instance.next(), is(19));
        assertThat(instance.next(), is(23));
        assertThat(instance.next(), is(29));
        assertThat(instance.next(), is(31));
    }
    
}
