/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mysery
 */
public class StringAnagram {
    
    public static boolean isAnagram(String word, String anagram)
    {
        if (word.length() != anagram.length())
            return false;
        int xorGateW = 0; //Xor gate is special for check ocurrences A^B^A == B also A^A == 0 
        int xorGateA = 0; //Xor gate is special for check ocurrences A^B^A == B also A^A == 0 
        for (int i = 0; i < word.length(); i++) {
            xorGateW ^= word.charAt(i);
            xorGateA ^= anagram.charAt(i);
        }
        if (xorGateW != 0 || xorGateA != 0) 
            return (xorGateW^xorGateA) == 0;
        else
            return (xorGateW != 0 && xorGateA == 0) ||
                    (xorGateW == 0 && xorGateA != 0);
    }

    public static boolean anAnagram(String word, String anagram)
    {
        if (word.length() != anagram.length())
            return false;
        Map<Character, Integer> mapW = new HashMap<>();
        Map<Character, Integer> mapA = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            incrementMap(mapW, word.charAt(i));
            incrementMap(mapA, anagram.charAt(i));
        }
        return mapW.entrySet().equals(mapA.entrySet());
    }

    private static void incrementMap(Map<Character, Integer> map, Character c) {
        if (map.containsKey(c))
            map.put(c, map.get(c)+1);
        else
            map.put(c, 1);
    }
}
