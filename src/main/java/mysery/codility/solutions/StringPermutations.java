/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * solve all permutation of string pass. ej: XYZ -> XYZ, XZY, YZX, YXZ, ZXY, ZYX
 *
 * @author mysery
 */
public class StringPermutations {

    public List<String> permutations(String word) {
        List<String> ret = new ArrayList<>(factorial(word.length()));
        permutation("", word, ret);
        return ret;
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private void permutation(String perm, String word, List<String> ret) {
        if (word.isEmpty()) {
            ret.add(perm);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), 
                            word.substring(0, i) + word.substring(i + 1, word.length()),
                            ret);
            }
        }
    }

}
