/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codility.com/programmers/task/frog_river_one/
 *
 * @author mysery
 */
public class FrogRiverOne {

    //https://codility.com/demo/results/trainingXRMF6T-DRF/
    public int solution(int X, int[] A) {
        int timeToCross = -1;
        Set<Integer> xPath = new HashSet<>(X);
        for (int i = 0; i < A.length; i++) {
            int B = A[i];
            if (B < X+1) {//si estan dentro del camino.
                xPath.add(B);//agregando no repetidos.
            }
            if (xPath.size() == X) {//si size llego al tamaño entonces ya puede crusar.
                timeToCross += i+1;//i zerobased, +1 cancela el -1 de no solucion
                break;//early out.
            }
        }

        return timeToCross;
    }

}
