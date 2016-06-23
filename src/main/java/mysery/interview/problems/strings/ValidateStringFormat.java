/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mysery
 */
public class ValidateStringFormat {

    public boolean validateString(String word) {
        Deque<Character> stackCorchetes = new ArrayDeque<>();//[]
        Deque<Character> stackParentesis = new ArrayDeque<>();//()
        Deque<Character> stackLlaves = new ArrayDeque<>();//{}
        for (int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (c.equals('{')) {
                stackLlaves.push(c);
            } else if (c.equals('[')) {
                stackCorchetes.push(c);
            } else if (c.equals('(')) {
                stackParentesis.push(c);
            }
            if (c.equals('}')) {
                stackLlaves.pollFirst(); //igual que pop pero null safe
            } else if (c.equals(']')) {
                stackCorchetes.pollFirst();
            } else if (c.equals(')')) {
                stackParentesis.pollFirst();
            }
        }

        return stackCorchetes.isEmpty() && stackLlaves.isEmpty() && stackParentesis.isEmpty();
    }

}
