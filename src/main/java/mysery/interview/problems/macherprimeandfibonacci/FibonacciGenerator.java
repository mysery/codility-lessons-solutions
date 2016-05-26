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
public class FibonacciGenerator implements Generator{

    private Integer n = 0;
    private Integer actual = 0;
    private Integer previus = 0;
    private Integer recent = 1;

    @Override
    public Integer next() {
        if (n < 2) {
            return n++;
        } else {
            actual = previus + recent;
            previus = recent;
            recent = actual;
            return actual;
        }
    }
}
