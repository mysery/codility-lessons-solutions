/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codewars.solutions;

import java.util.Arrays;

/**
 *
 * @author mysery
 */
public class Kata {

    public static int findEvenIndex(int[] arr) {

        int[] sumLeft = new int[arr.length];
        int[] sumRight = new int[arr.length];
        sumLeft[0] = arr[0];
        sumRight[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            sumLeft[i] += sumLeft[i - 1] + arr[i];
            sumRight[arr.length - i - 1] += sumRight[arr.length - i] + arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }

    /*
     * solucion por la comunidad vladkha , NickyBoy
     */
    public static int findEvenIndex2(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i - 1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) {
                return i;
            }
        }
        return -1;
    }
}
