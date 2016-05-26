/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.macherprimeandfibonacci;

/**
 *
 * @author mysery
 */
public class PrimeGenerator implements Generator{

    private Integer start = 1;
    private boolean first = true;
    private Integer prime = 0;

    @Override
    public Integer next() {
        prime = start;
        if (first) {
            first = false;
            start++;
            return prime;

        }
        int divisores = 0;
        for (int i = 1; i <= start; i++) {
            if (start % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            prime = start;
            start++;
            return prime;
        }
        start++;
        return next();
    }
}
