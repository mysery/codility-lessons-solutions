/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.occurrences;

import java.util.Map;
import mysery.interview.problems.groupby.IGroupBy;

/**
 *
 * @author mysery
 */
public interface IOccurrences {

    public Map<Character, Integer> wordOccurrences(String word, IGroupBy groupBy);
}
