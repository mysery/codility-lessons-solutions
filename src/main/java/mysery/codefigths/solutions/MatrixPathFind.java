/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

/**
 *
 * @author mysery
 */

/*
 You are given a n x m matrix, which contains all the integers from 1 to n *
 m, inclusive, each exactly once.
 Initially you are standing in the cell containing the number 1. On each turn
 you are allowed to move to an adjacent cell, i.e. to a cell that shares a
 common side with the one you are standing on now. It is prohibited to visit
 any cell more than once.
 Check if it is possible to visit all the cells of the matrix in the order of
 increasing numbers in the cells, i.e. get to the cell with the number 2 on
 the fget to the cell with the number 2 onirst turn, then move to 3, etc.
 Example
 For
 matrix = [[1, 4, 5], [2, 3, 6]]
 the output should be findPath(matrix) = true;
 For
 matrix = [[1, 3, 6], [2, 4, 5]]
 the output should be findPath(matrix) = false.
 Input/Output
 [time limit] 3000ms (java)
 [input] array.array.integer matrix
 A non-empty 2-dimensional array of integers representing a rectangular
 matrix.
 Constraints: 1 ≤ matrix.length ≤ 5, 1 ≤ matrix[0].length ≤ 10, 1 ≤
 matrix[i][j] ≤ 15.
 [output] boolean
 
 
 */
public class MatrixPathFind {

    public boolean findPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int nxm = n*m;
        int jumpIndexN = 0;
        int jumpIndexM = 0;
        boolean isBackN = false;
        boolean isBackM = false;
        int actual = matrix[jumpIndexN][jumpIndexM];
        for (int i = 0; i < nxm; i++) {
            int nextN = jumpIndexN + 1;
            if (nextN >= n || isBackN){ 
                nextN = jumpIndexN - 1;
                isBackN=true;
            }
            int nextM = jumpIndexM + 1;
            if (nextM >= m || isBackM){
                nextM = jumpIndexM - 1;
                isBackM=true;
            }
            if (nextN <0){
                isBackN=false;
                continue;
            }
            if (nextM <0){
                isBackM=false;
                continue;
            }
            if (matrix[jumpIndexN][nextM] - actual == 1) {
                jumpIndexM = nextM;
            } else {
                if (matrix[nextN][jumpIndexM] - actual == 1) {
                    jumpIndexN = nextN;
                } else {
                    if (matrix[jumpIndexN][nextM] - actual < 0 && matrix[nextN][jumpIndexM] - actual < 0)
                        return true; //no se permite el regreso.
                    return false;
                }
            }

            actual = matrix[jumpIndexN][jumpIndexM];
        }
        return true;
    }

}
