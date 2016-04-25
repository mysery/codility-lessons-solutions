/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codility.solutions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mysery
 */
public class BinaryGap {

    //Matches 100, 100, 10 in 0100100101.
    private static final Pattern pattern = Pattern.compile("(10+)(?=1)");

    public int secuenceGap(int n) {
        String s = Integer.toBinaryString(n);
        Matcher m = pattern.matcher(s);
        int max = 0;
        while (m.find()) {
            String g = m.group();
            int gLength = g.length();
            if (gLength > 0 && gLength - 1 > max) {
                max = gLength - 1;
            }
        }
        return max;
    }

}
