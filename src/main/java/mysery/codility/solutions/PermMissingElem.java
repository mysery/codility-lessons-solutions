/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

/**
 *
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains integers in the range [1..(N + 1)], which means that exactly one
 * element is missing.
 *
 * Your goal is to find that missing element.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a zero-indexed array A, returns the value of the missing element.
 *
 * For example, given array A such that: A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5
 *
 * the function should return 4, as it is the missing element.
 *
 * Assume that:
 *
 * N is an integer within the range [0..100,000]; the elements of A are all
 * distinct; each element of array A is an integer within the range [1..(N +
 * 1)].
 *
 * Complexity:
 *
 * expected worst-case time complexity is O(N); expected worst-case space
 * complexity is O(1), beyond input storage (not counting the storage required
 * for input arguments).
 *
 * Elements of input arrays can be modified.
 *
 * @author mysery
 */
public class PermMissingElem {

    //https://codility.com/demo/results/trainingYG2JTV-EMH/
    //100of100
    public int solution(int[] A) {
        int missElem = A.length+1;
        int i = 0;
        while (i < A.length) {
            missElem ^= A[i];
            missElem ^= ++i;
        }
        return missElem;
    }
    
    //https://codility.com/demo/results/training5WM6WW-VTF/
    //80of100
    public int solution2(int[] A) {
        //remember triangular number of gauss
        int size = A.length;
        int totalSum = size+(size*(size+1)/2)+1;//size is last number to add +totalSum + zero base
        for (int B : A) {
            totalSum -= B;
        }
        return totalSum;
    }
}
