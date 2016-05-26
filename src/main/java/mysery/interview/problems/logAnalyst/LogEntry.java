/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.logAnalyst;

/**
 * 
 * @author mysery
 */
public interface LogEntry {

    int getTimestamp();

    boolean isStarting();

    String getMethodName();
}
