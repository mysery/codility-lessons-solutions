/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.strings;


import java.util.HashSet;
import java.util.Set;

/**
 * http://javarevisited.blogspot.com/2016/06/how-to-remove-duplicate-characters-from-String-Java.html
 *
 * @author mysery
 */
public class RemoveDuplicates {

    public static String removeDuplicates(String word) {
        if (word == null || word.length() <= 1) {
            return word;
        }

        Set<Character> unduplicate = new HashSet<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            unduplicate.add(word.charAt(i));            
        }
        StringBuilder ret = new StringBuilder(unduplicate.size());
        for (Character c : unduplicate) {
            ret.append(c);
        }
        return ret.toString();
    }
    public static String removeDuplicatesJ8(String word) {
        if (word == null || word.length() <= 1) {
            return word;
        }

        StringBuilder sb = new StringBuilder(word.length());
        word.chars().distinct().mapToObj(ch -> (char)ch).forEach((ch) -> sb.append(ch));
        
        return sb.toString();
    }
}
