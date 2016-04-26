/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mysery
 */
public class MissingInteger {

    //UNSOLVE
    public int solution(int[] A) {
        int minOcurrence = 0;//minimal positive integer (greater than 0) 
        TreeSet minMissing = new TreeSet();//minimal positive integer (greater than 0) 
        for (int i = 0; i < A.length; i++) {
            int B = A[i];
            if (B > 0) {
                minMissing.add(B);
            }
        }
        return minOcurrence;
    }

}
