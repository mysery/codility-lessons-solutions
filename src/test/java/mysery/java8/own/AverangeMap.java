package mysery.java8.own;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mysery
 */
public class AverangeMap {

    @Test
    public void testMapToAverage() {
        LinkedHashMap<String, List<Double>> map = new LinkedHashMap<>();
        map.put("10/1", Arrays.asList(2.3, 41.6, 2.3, 2.3, 2.3, 2.3));
        map.put("10/2", Arrays.asList(2.3));
        map.put("10/Enero", Arrays.asList(10d, 5d, 3d));
        map.put("10/Febrero", Arrays.asList());

        LinkedHashMap<String, Double> s = new LinkedHashMap<>();
        map.entrySet().forEach(
                (es) -> s.put(es.getKey(), 
                        es.getValue().stream().mapToDouble((d) -> (d)).average().orElse(0)));
        assertEquals(s.get("10/1"), 8.85, 0.001);
        assertEquals(s.get("10/2"), 2.3, 0.001);
        assertEquals(s.get("10/Enero"), 6, 0.001);
        assertEquals(s.get("10/Febrero"), 0, 0.001);
    }
}
