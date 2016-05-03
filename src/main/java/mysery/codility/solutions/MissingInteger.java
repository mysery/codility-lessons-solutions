/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.Arrays;

/**
 * https://codility.com/programmers/task/missing_integer/
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

}
