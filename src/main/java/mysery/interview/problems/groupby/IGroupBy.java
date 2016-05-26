/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.groupby;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author mysery
 */
public interface IGroupBy {

    public <T, G> Map<G, Collection<T>> groupBy(Collection<T> collection, Grouper<T, G> grouper);
}
