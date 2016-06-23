/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.collabedit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * bimap que permita la utilizacion de valores repetidos.
 * @author mysery
 * @param <K>
 * @param <V> 
 */
public class BiMap<K, V> {

    private final Map<K, V> keyMap = new HashMap<>();
    private final Map<V, LinkedList<K>> valueMap = new HashMap<>();

    public void put(K key, V value) {
        keyMap.put(key, value);
        LinkedList<K> l;
        if (valueMap.containsKey(value)) {
            l = valueMap.get(value);
        } else {
            l = new LinkedList<>();
        }
        l.add(key);
        valueMap.put(value, l);
    }

    public V getValue(K key) {
        return keyMap.get(key);
    }

    public List<K> getKeys(V value) {
        return valueMap.get(value);
    }
    
    public V remove(K key){
        V value = keyMap.remove(key);
        LinkedList<K> listKeys = valueMap.get(value);
        listKeys.remove(key);
        //Limpio en caso de habler sacado todas.
        if (listKeys.isEmpty())
            valueMap.remove(value);
        
        return value;
    }
    
    public LinkedList<K> removeValue(V value){
        LinkedList<K> listKeys = valueMap.remove(value);
        for (K key : listKeys) {
            V valK = keyMap.remove(key);
            if (valK != null && !valK.equals(valK))
                throw new RuntimeException("se elimina una key que no tiene el valor correspondiente");
        }
        
        return listKeys;
    }

}
