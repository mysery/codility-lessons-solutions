package mysery.interview.problems.occurrences;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import mysery.interview.problems.occurrences.Occurrences;
import java.util.HashMap;
import java.util.Map;
import mysery.interview.problems.groupby.GroupBy;
import mysery.interview.problems.groupby.IGroupBy;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class OccurrencesTest {
    
    public OccurrencesTest() {
    }

    /**
     * Test of wordOccurrences method, of class Occurrences.
     */
    @Test
    public void testWordOccurrences() {
        System.out.println("wordOccurrences");
        String word = "Roberto";
        IGroupBy groupBy = new GroupBy();
        Occurrences instance = new Occurrences();
        Map<Character, Integer> expResult = new HashMap<>();
        expResult.put('e', 1);
        expResult.put('t', 1);
        expResult.put('b', 1);
        expResult.put('r', 2);
        expResult.put('o', 2);
        Map<Character, Integer> result = instance.wordOccurrences(word, groupBy);
        assertEquals(expResult, result);
    }
    
}
