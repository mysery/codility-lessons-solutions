/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import java.util.LinkedHashMap;

/**
 *
 * @author mysery
 */
/*


 You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

 Return an array of names that will be given to the files.

 Example

 For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
 fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

 Input/Output

 [time limit] 3000ms (java)

 [input] array.string names

 Constraints:
 5 ≤ names.length ≤ 15,
 1 ≤ names[i].length ≤ 15.

 [output] array.string


 */
public class FileRenaming {

    public static String[] fileNaming(String[] names) {

        LinkedHashMap<String, Integer> m = new LinkedHashMap<>(names.length);
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            if (m.containsKey(n)) {
                if (m.get(n) > 0) {
                    String newName = n + "(" + m.get(n) + ")";
                    if (m.containsKey(newName)) {
                        m.put(newName, m.get(newName) + 1);
                        newName = n + "(" + (m.get(n)+m.get(newName)-1) + ")";
                        m.put(n, m.get(n) + 1);
                    } else {
                        m.put(newName, 1);
                    }
                    names[i] = newName;
                }
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }

        return names;
    }
}
