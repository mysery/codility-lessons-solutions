/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

/**
 *
 * @author mysery
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int length = A.length;
        if (K == 0 || length == 0 || K % length == 0) {//casos extremos.
            return A;
        }
        int fixedK = ((K % length) + length) % length; //obtengo mejor el offsset
        int[] dest = new int[length];
        for (int i = 0; i < length; i++) {
            dest[(i + fixedK) % length] = A[i];
        }
        return dest;
    }

}
