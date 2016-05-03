/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.Arrays;

/**
 * 
 * @author mysery
 */
public class MaxCounters {

    // 77 of 100 becouse complexity. first solution.
    // https://codility.com/demo/results/trainingJUR3UC-Z7K/
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        int maxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            int B = A[i];
            if (B > 0 && B <= N) {
                maxCounter = Math.max(maxCounter, ++counters[B-1]);
            } else {
                Arrays.fill(counters, maxCounter); //this get complex O(N*M)
            }
        }
        return counters;
    }
    //100of100 https://codility.com/demo/results/trainingKNSHZ3-JQU/
    public int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);
        int maxCounter = 0;
        int maxIncrease = 0;
        for (int i = 0; i < A.length; i++) {
            int B = A[i];
            if (0 <= B && B <= N) {
                counters[B-1] = Math.max(counters[B-1], maxIncrease);
                maxCounter = Math.max(maxCounter, ++counters[B-1]);
            } else {
                maxIncrease = maxCounter;
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(counters[i], maxIncrease);
        }
        return counters;
    }
}
