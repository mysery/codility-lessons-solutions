/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/programmers/task/perm_check/
 *
 * @author mysery
 */
public class PermCheck {

    public int solution(int[] A) {
        int maxValue = Integer.MIN_VALUE;
        Set<Integer> xPath = new HashSet<>(A.length);
        for (int i = 0; i < A.length; i++) {
            if (!xPath.add(A[i])){
                return 0;//no debe tener repetidos una permutcion
            }
            if (A[i]>maxValue) {
                maxValue = A[i];//el maximo valor sera el que me dice el limite de permutacion
            }
        }
        return (maxValue==A.length)?1:0;//Si el maximo valor es igual al N
    }
    
    

}
