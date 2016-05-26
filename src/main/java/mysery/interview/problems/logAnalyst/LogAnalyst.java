/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.logAnalyst;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mysery
 */
public class LogAnalyst {

    public Map<String, Integer> analyze(List<LogEntry> log) {
        Map<String, Integer> result = new HashMap<>();
        /**
         * Stack para manejar todas las invocaciones e ir calculando los tiempos
         * segun las llegadas.
         */
        Deque<LogEntry> stack = new ArrayDeque<>();
        /**
         * utilizado como Stack para los tiempos muertos entre invocaciones,
         * almacena el tiempo que tomo las invocaciones intermedias para luego
         * calcular el verdadero valor del tiempo consumido. Para actualizar los
         * valores se trabaja como si fuera una cola.
         */
        Deque<Integer> idleTimesDeque = new ArrayDeque<>();
        for (LogEntry entry : log) {            
            if (entry.isStarting()) {
                stack.push(entry);
                idleTimesDeque.push(0);
            } else {
                LogEntry stackedEntry = stack.pop();
                Integer unusedTime = idleTimesDeque.pop();
                //El tiempo que usa un metodo es el final - inicio - (tiempo que utilizaron los metodos intermedios)
                Integer usedTime = entry.getTimestamp() - stackedEntry.getTimestamp() - unusedTime;
                assingMap(result, stackedEntry, usedTime);
                for (int i = 0; i < idleTimesDeque.size(); i++) {
                    idleTimesDeque.addFirst(idleTimesDeque.pollLast() + usedTime);
                }
            }
        }
        return result;
    }

    /**
     * Agrega el valor al mapa, si existe acumula el existente, caso contrario agrega el tiempo.
     * @param map mapa.
     * @param entry LogEntry que tiene la informacion de invocacion.
     * @param usedTime tiempo consumido.
     */
    private void assingMap(Map<String, Integer> map, LogEntry entry, Integer usedTime) {
        if (map.containsKey(entry.getMethodName())) {
            map.put(entry.getMethodName(), map.get(entry.getMethodName()) + usedTime);
        } else {
            map.put(entry.getMethodName(), usedTime);
        }
    }
}
