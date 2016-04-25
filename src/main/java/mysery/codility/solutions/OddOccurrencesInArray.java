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
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        if (A.length == 0 || A.length % 2 == 0) {
            return -1;
        }
        if (A.length == 1) {
            return A[0];
        }
        int ret = 0;
        for (int B : A) {
            ret ^= B;
        }
        return ret;
    }
}
