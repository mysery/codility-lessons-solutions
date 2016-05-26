/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.groupby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroupBy implements IGroupBy {

    @Override
    public <T, G> Map<G, Collection<T>> groupBy(Collection<T> collection, Grouper<T, G> grouper) {
        Map<G, Collection<T>> resultGroup = new HashMap<>();
        for (T elemet : collection) {
            G groupKey = grouper.assignGroup(elemet);
            if (resultGroup.containsKey(groupKey)) {
                resultGroup.get(groupKey).add(elemet);
            } else {
                resultGroup.put(groupKey, new ArrayList<>(Arrays.asList(elemet)));
            }
        }
        return resultGroup;
    }

}
