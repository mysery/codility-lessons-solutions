/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.Arrays;
import java.util.BitSet;
import sun.reflect.generics.tree.Tree;

/**
 * https://codility.com/programmers/task/missing_integer/
 *
 * @author mysery
 */
public class MissingInteger {

    //https://codility.com/demo/results/trainingQMM4F2-PWG/
    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length];
        Arrays.fill(seen, false);
        for (int value : A) {
            if (0 < value && value <= A.length) {
                seen[value - 1] = true;
            }
        }

        for (int i = 0; i < seen.length; i++) {
            if (seen[i] == false) {
                return i + 1;
            }
        }

        return A.length + 1;
    }

    //https://codility.com/demo/results/trainingN9B3Q3-J8G/
    //Hay problemas en el extremo inferior.
    public int solutionBitSet(int[] A) {
        BitSet bs = new BitSet(A.length - 1);
        for (int value : A) {
            if (0 < value && value <= A.length) {
                bs.set(value - 1);
            }
        }
        if (bs.isEmpty()) {
            return A.length + 1;
        } else {
            return bs.nextClearBit(0) + 1;
        }
    }
}
