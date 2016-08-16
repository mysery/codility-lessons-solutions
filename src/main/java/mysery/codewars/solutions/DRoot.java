/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codewars.solutions;

/**
 *
 * @author mysery
 */
public class DRoot {

    public static int digital_root(int n) {
        while (n / 10 > 0) {
            n = dsum(n);
        }
        return n;
    }

    public static int dsum(int n) {
        int ret = 0;
        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

    /*
     * solve by trollingIsAart
     */
    public static int digital_root2(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}
