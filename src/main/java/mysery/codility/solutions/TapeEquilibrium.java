/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

/**
 * https://codility.com/demo/results/training48HCWR-5HR/
 * @author mysery
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int sizeReduce = A.length-1;
        int[] sumLeftA = new int[sizeReduce];
        int[] sumRigthA = new int[sizeReduce];
        //para resolver necesitamos ir acumulando los valores, lo podemos hacer con un reduce
        //entonces vamos almacenando los valores necesarios dentro un array auxiliar sumando el valor anterior.
        //de igual manera de atras para delante, de esta forma tenemos todas las posibles sumas.
        sumLeftA[0] = A[0];
        sumRigthA[sizeReduce-1] = A[sizeReduce];
        for (int i = 1; i < sizeReduce; i++) {
            sumLeftA[i] = sumLeftA[i - 1] + A[i];
            sumRigthA[sizeReduce - i - 1] = sumRigthA[sizeReduce - i] + A[sizeReduce - i];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < sumRigthA.length; i++) {
            A[i] = Math.abs(sumLeftA[i] - sumRigthA[i]);
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }
}
