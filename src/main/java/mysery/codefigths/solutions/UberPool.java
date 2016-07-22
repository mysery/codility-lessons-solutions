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


 Uber has introduced UberPool to make sure there are fewer cars on the road, which means less traffic, faster travel times and cheaper rides. Here is how UberPool works: it matches different riders heading in the same direction, giving a driver two pick-up and two drop-off locations on the same trip. UberPool is limited to two riders per trip, which means that sometimes a driver has to choose which request to accept.

 Consider a city represented as integer points on the Cartesian plane, with roads parallel to the axes. There's a driver who picked up a passenger at point A and is heading to point B with them, taking one of the shortest possible routes. When the driver reaches point C, she receives two more requests: one from a rider at point X, another from a rider at point Y. Both riders are also going to point B.

 Your task is to find out which additional rider should be picked up (if any), taking into account that the final length of the trip can't be more than two times longer than the length of the trip with no extra riders. If both requests meet this condition, accept the one with the shortest route. If the lengths of the routes are the same, accept the first request.

 Example

 For A = [0, 0], B = [3, 3], C = [3, 1], X = [5, 0] and Y = [2, 2], the output should be
 uberPool(A, B, C, X, Y) = 2.

 The initial distance is 6, the route with the passenger at point X is of length 12, the route with the passenger at point Y is of length 8. Both pick-ups are possible; however, it's better to pick up the passenger at Y, since the route with him is shorter. See the picture below for details.

 Input/Output

 [time limit] 3000ms (java)

 [input] array.integer A

 The departure point, represented as array of two integers - x and y coordinates.

 Constraints:
 -100 ≤ A[i] ≤ 100.

 [input] array.integer B

 The destination point.

 Constraints:
 -100 ≤ B[i] ≤ 100.

 [input] array.integer C

 The point at which two new requests came in.

 Constraints:
 -100 ≤ C[i] ≤ 100.

 [input] array.integer X

 Coordinates of the first request.

 Constraints:
 -100 ≤ X[i] ≤ 100.

 [input] array.integer Y

 Coordinates of the second request.

 Constraints:
 -100 ≤ Y[i] ≤ 100.

 [output] integer

 Return 1 if the passenger at point X should be picked up, 2 if the passenger at point Y should be picked up, or -1 if it's impossible to accept any of the additional requests.


 */
public class UberPool {

    int uberPool(int[] A, int[] B, int[] C, int[] X, int[] Y) {

        class Helper {

            int distance(int[] P, int[] Q) {
                return Math.abs(P[0] - Q[0]) + Math.abs(P[1] - Q[1]);
            }
        }
        Helper h = new Helper();

        int initialDist = h.distance(A, B);
        int travelledDist = h.distance(A, C);
        int[][] D = new int[][]{X, Y};
        int[] remainingDist = new int[2];
        for (int i = 0; i < 2; i++) {
            remainingDist[i] = h.distance(C, D[i]) + h.distance(D[i], B);
        }

        int best = 1;
        if (remainingDist[0] > remainingDist[1]) {
            best = 2;
        }

        if (2*initialDist-travelledDist < remainingDist[0] && 2*initialDist-travelledDist < remainingDist[1]) {
            best = -1;
        }

        return best;
    }
}
