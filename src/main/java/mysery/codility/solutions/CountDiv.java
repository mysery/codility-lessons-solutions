/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

/**
 * https://codility.com/programmers/task/count_div/
 *
 * @author mysery
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        int minDiv = (A-1)/K;
        if (minDiv > B)
            return 0;
            
        return B/K - minDiv;
    }

}
