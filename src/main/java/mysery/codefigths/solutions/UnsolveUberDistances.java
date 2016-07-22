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


 Consider a city where the streets are perfectly laid out to form an infinite square grid. In this city finding the shortest path between two given points (an origin and a destination) is much easier than in other more complex cities. As a new Uber developer, you are tasked to create an algorithm that does this calculation.

 Given user's departure and destination coordinates, each of them located on some street, find the length of the shortest route between them assuming that cars can only move along the streets.

 Example

 For departure = [0.4, 1] and destination = [0.9, 3], the output should be
 perfectCity(departure, destination) = 2.7.

 Input/Output

 [time limit] 3000ms (java)

 [input] array.float departure

 An array [x, y] of x and y coordinates. It is guaranteed that at least one coordinate is integer.

 Constraints:
 0.0 ≤ departure[i] ≤ 10.0.

 [input] array.float destination

 The destination is given the same way as the departure location.

 Constraints:
 0.0 ≤ destination[i] ≤ 10.0.

 [output] float

 The shorted distance between two points along the streets.


 */
public class UnsolveUberDistances {

    double perfectCity(double[] departure,
            double[] destination) {
        double result = 0;
        for (int i = 0; i < 2; i++) {
            if (Math.abs(departure[i] - destination[i]) < 1) {
                double floorSum = departure[i] - Math.floor(departure[i]);
                floorSum += destination[i] - Math.floor(destination[i]);
                if (floorSum < 1) {
                    result += floorSum;
                    departure[i] = Math.floor(departure[i]);
                    destination[i] = Math.floor(destination[i]);
                } else {
                    result += 2 - floorSum;
                    departure[i] = Math.ceil(departure[i]);
                    destination[i] = Math.ceil(destination[i]);
                }
            } else {
                if (departure[i] > destination[i]) {
                    double[] tmp = destination;
                    destination = departure;
                    departure = tmp;
                }
                result += Math.ceil(departure[i]) - departure[i];
                departure[i] = Math.ceil(departure[i]);
                result += destination[i] - Math.floor(destination[i]);
                destination[i] = Math.floor(destination[i]);
            }
            result += destination[i] - departure[i];
        }

        return result;
    }

    /* tests
    Input:

departure: [0.4, 1]
destination: [0.9, 3]

Output:

2.3

Expected Output:

2.7
    
    Input:

departure: [2.4, 1]
destination: [5, 7.3]

Output:

8.9
    
    Input:

departure: [0, 0.2]
destination: [7, 0.5]

Output:

6.7

Expected Output:

7.7
    
    Input:

departure: [0.9, 6]
destination: [1.1, 5]

Output:

2

Expected Output:

1.2
    
    Input:

departure: [0, 0.4]
destination: [1, 0.6]

Output:

1

Expected Output:

2
    */
}
