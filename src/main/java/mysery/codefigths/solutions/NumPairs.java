/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import com.sun.javafx.geom.Matrix3f;

/**
 *
 * @author mysery
 */
/*


 Given A, B, C and D, you should find the number of distinct pairs of real numbers X and Y, such that:

 0 < X, Y < 1;
 numbers A * X + B * Y and C * X + D * Y are integers.

 Example

 For A = 1, B = 2, C = 10 and D = 12, the output should be
 NumPairs(A, B, C, D) = 6.

 The pairs are :

 (0.25,0.375)
 (0.5,0.25)
 (0.75,0.125)
 (0.25,0.875)
 (0.5,0.75)
 (0.75,0.625)

 Note

 The input will not generate infinite solutions and there will be no random input. The test cases will generate an output between [0, 2 * 109].

 Input/Output

 [time limit] 3000ms (java)

 [input] integer A

 Constraints:
 0 < A < 109.

 [input] integer B

 Constraints:
 0 < B < 109.

 [input] integer C

 Constraints:
 0 < C < 109.

 [input] integer D

 Constraints:
 0 < D < 109.

 [output] integer


 */
public class NumPairs {

    int NumPairs(int A, int B, int C, int D) {

    int solutions = 0;
    double epsilon = 0.000001d;
    double z = 0.0001d;
    //X > 0;
    //Y < 1;
    //(A * X + B * Y) % 1 == 0;
    //(C * X + D * Y) % 1 == 0;
    //A,B dot X,Y
    //C,B dot X,Y
    //A*z + B*(1-z)
    //A*z + B*(1-z)
    
    // x = r×y + m 
    // X-Y = 1
    // a - (n * int(a/n))
    double a = (double)A;
    double b = (double)B;
    double c = (double)C;
    double d = (double)D;
    System.out.println(((double)A * 0.25d + (double)B * 0.375d) % 1 == 0);
    System.out.println(((double)C * 0.25d + (double)D * 0.375d) % 1 == 0);
    double X = z;
    while (X > 0 &&  X < 1 && solutions < 2000000000){
        double Y = z;
        //System.out.println("check x,y: "+ X+" , "+Y);
        while (Y > 0 && Y < 1 && solutions < 2000000000){
            
            if ((a * X + b * Y) % 1 == 0 &&
               (c * X + d * Y) % 1 == 0){
                solutions++;
                System.out.println("Find one x,y: "+ X+" , "+Y);
            }
            
            //&& Double.compare(X,Y) != 0
            Y += z;
        }
        X += z;
    }
    return solutions;
}

}
