/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.logAnalyst;

import mysery.interview.problems.logAnalyst.LogEntry;
import mysery.interview.problems.logAnalyst.LogAnalyst;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class LogAnalystTest {

    public LogAnalystTest() {
    }

    /**
     * Test of analyze method, of class LogAnalyst.
     */
    @Test
    public void testAnalyze() {
        System.out.println("analyze");
        List<LogEntry> log = new ArrayList<>();
        log.add(new LogEntryImpl(120, true, "getFoo"));
        log.add(new LogEntryImpl(121, true, "getManyTimes"));
        log.add(new LogEntryImpl(122, false, "getManyTimes"));
        log.add(new LogEntryImpl(126, true, "getManyTimes"));
        log.add(new LogEntryImpl(128, false, "getManyTimes"));
        log.add(new LogEntryImpl(130, true, "getBar"));
        log.add(new LogEntryImpl(150, true, "getBaz"));
        log.add(new LogEntryImpl(190, false, "getBaz"));
        log.add(new LogEntryImpl(200, false, "getBar"));
        log.add(new LogEntryImpl(206, true, "getRecursive"));
        log.add(new LogEntryImpl(210, true, "getRecursive"));
        log.add(new LogEntryImpl(216, false, "getRecursive"));
        log.add(new LogEntryImpl(221, false, "getRecursive"));
        log.add(new LogEntryImpl(223, false, "getFoo"));
        LogAnalyst instance = new LogAnalyst();
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("getManyTimes", 3);
        expResult.put("getRecursive", 15);
        expResult.put("getBaz", 40);
        expResult.put("getBar", 30);
        expResult.put("getFoo", 15);
        Map<String, Integer> result = instance.analyze(log);
        assertEquals(expResult, result);
    }

    private static class LogEntryImpl implements LogEntry {

        int timestamp;
        boolean starting;
        String method;

        public LogEntryImpl(int timestamp, boolean starting, String method) {
            this.timestamp = timestamp;
            this.starting = starting;
            this.method = method;
        }

        @Override
        public int getTimestamp() {
            return timestamp;
        }

        @Override
        public boolean isStarting() {
            return starting;
        }

        @Override
        public String getMethodName() {
            return method;
        }

        @Override
        public String toString() {
            return "LogEntryImpl{" + "timestamp=" + timestamp + ", starting=" + starting + ", method=" + method + '}';
        }
        
        
    }

}
