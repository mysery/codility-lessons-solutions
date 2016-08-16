/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.codefigths.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 *
 * @author mysery
 */
/*
 Challenge
 Who doesn't want 2000 Coins, Huh?

 You being a smartass coder, immediately saw that going "NORTH" and then "SOUTH" is not reasonable, better stay put! Similarly going "EAST" and then "WEST" is a waste of time. Hence, the directions given in the poster can be simplified in two steps as shown below:

 Step 1: Remove the following pair of opposite directions:

 directions = [ <"NORTH", "SOUTH">, 
 "SOUTH",  <"EAST", "WEST">, 
 "NORTH",  <"WEST", "EAST">, 
 "NORTH", "WEST", "SOUTH", 
 "EAST", <"NORTH", "SOUTH">, 
 <"EAST", "WEST">, "NORTH", 
 "NORTH", "WEST"]

 Step 2: Remove the following pair of opposite directions:

 directions = [ <"SOUTH", "NORTH">, "NORTH", 
 "WEST", "SOUTH", "EAST", 
 "NORTH", "NORTH", "WEST"]

 The resulting path cannot be further simplified. Hence, the shorter version of the directions given in the poster would be ["NORTH", "WEST", "SOUTH", "EAST", "NORTH", "NORTH", "WEST"].

 Your task is to create a simplified version of the given directions to get the desired 2000 coins.

 Example

 For

 directions = ["NORTH", 
 "SOUTH", 
 "SOUTH", 
 "EAST", 
 "WEST", 
 "NORTH", 
 "WEST"]

 the output should be
 ReduceDirections(directions) = ["WEST"].

 For

 directions = ["NORTH", 
 "SOUTH", 
 "SOUTH", 
 "EAST", 
 "WEST", 
 "NORTH"

 the output should be
 ReduceDirections(directions) = [].

 Input/Output

 [time limit] 3000ms (java)

 [input] array.string directions

 An array consisting of directions, where each direction is one of the following: "NORTH", "SOUTH", "EAST" or "WEST".

 Constraints:
 5 ≤ directions.length ≤ 30.

 [output] array.string

 A simplified version of the given directions.

 */
public class ReduceDirections {

    static final String N = "NORTH";
    static final String S = "SOUTH";
    static final String W = "WEST";
    static final String E = "EAST";

    String[] ReduceDirections(String[] ds) {
        return e(ds, ds.length);
    }

    String[] e(String[] ds, int l) {
        ArrayList<String> r = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            String a = ds[i];
            String n = (i + 1 < l) ? ds[i + 1] : null;
            if (c(a, n)) {
                i++;
            } else {
                r.add(a);
            }
        }
        if (l != r.size()) {
            return e(r.toArray(new String[]{}), r.size());
        } else {
            return r.toArray(new String[]{});
        }
    }

    boolean c(String d1, String d2) {
        switch (d1) {
            case N:
                return S.equals(d2);
            case W:
                return E.equals(d2);
            case S:
                return N.equals(d2);
            case E:
                return W.equals(d2);
        }
        return false;
    }
//    public String[] ReduceDirections(String[] ds) {
//
//        return e(ds, ds.length, new C());
//    }
//
//    String[] e(String[] ds, int l, C c) {
//        for (String d : ds) {
//            c.e(d);
//        }
//        c.m();
//        if (l != c.s()) {
//            return e(c.a(), c.s(), c.c());
//        } else {
//            return c.a();
//        }
//    }
//
//    class C {
//
//        Deque<String> d = new ArrayDeque<>();
//        Deque<String> r = new ArrayDeque<>();
//
//        int s() {
//            return r.size();
//        }
//
//        void e(String c) {
//            if (!d.isEmpty() && cu(d.peek(), c)) {
//                u();
//            } else {
//                d.push(c);
//            }
//        }
//
//        void u() {
//            d.pop();
//            m();
//            d.clear();
//        }
//
//        private boolean cu(String d1, String d2) {
//            switch (d1) {
//                case N:
//                    return S.equals(d2);
//                case W:
//                    return E.equals(d2);
//                case S:
//                    return N.equals(d2);
//                case E:
//                    return W.equals(d2);
//            }
//            return false;
//        }
//
//        private String[] a() {
//            return r.toArray(new String[]{});
//        }
//
//        private C c() {
//            d.clear();
//            r.clear();
//            return this;
//        }
//
//        private void m() {
//            while (!d.isEmpty()) {
//                r.addFirst(d.pollLast());
//            }
//        }
//    };
}
