/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.java16.betterprogrammer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mysery
 */
public class BetterProgrammerTask {

    public static int[] retainPositiveNumbers(int[] a) {
        /*
         Please implement this method to
         return a new array with only positive numbers from the given array.
         The elements in the resulting array shall be sorted in the ascending order.
         */
        TreeSet<Integer> t = new TreeSet<Integer>(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                int ret = o1.compareTo(o2);
                return (ret == 0) ? 1 : ret; //de esta forma permitiremos agregar repetidos.
            }
        });
        for (int b : a) {
            if (b >= 0) {
                t.add(b);//Log n insertions.
            }
        }
        int[] ret = new int[t.size()];
        int i = 0;
        for (Iterator<Integer> iterator = t.iterator();
                iterator.hasNext();
                i++) {
            Integer next = iterator.next();
            ret[i] = next;
        }
        return ret;
    }

    public static int countWords(String s) {
        /*
         Please implement this method to
         return the word count in a given String.
         Assume that the parameter String can only contain spaces and alphanumeric characters.
         */
        String ret = s.trim();
        if (ret.length() > 0) {
            return s.split("\\s+").length;
        } else {
            return 0;
        }
    }

    public static int getRequiredNumberOfBits(int N) {
        /*
         Please implement this method to
         return the number of bits which is just enough to store any integer from 0 to N-1 inclusively
         for any int N > 0
         Example: to store 5 integers from 0 to 4 you need 3 bits: 000, 001, 010, 011, 100 and 101
         */
        if (N > 0) {
            return Integer.toBinaryString(N).length();
        } else {
            return 0;
        }
    }

    // Please do not change this interface
    public interface ListNode {

        int getItem();

        ListNode getNext();

        void setNext(ListNode next);
    }

    public static ListNode reverse(ListNode node) {
        /*
         Please implement this method to
         reverse a given linked list.
         */
        ListNode prev = null;
        ListNode actual = node;
        while (actual != null) {
            ListNode next = actual.getNext();
            actual.setNext(prev);
            prev = actual;
            actual = next;
        }
        /*
         intento recursivo.... 
         if (node == null)
         return null;
         if (node.getNext() == null)
         return node;
        
         ListNode next = node.getNext();
         if (next != null){
         ListNode prev = next.getNext();
         node.setNext(prev);
         next.setNext(node);
         }
         ListNode next = reverse(node.getNext());
         */
        return prev;
    }

    public static int countWaysToProduceGivenAmountOfMoney(int cents) {
        /*
         Please implementthis  method to
         return the number of different combinations of US coins
         (penny: 1c, nickel: 5c, dime: 10c, quarter: 25c, half-dollar: 50)
         which may be used to produce a given amount of money.

         For example, 11 cents can be produced with
         one 10-cent coin and one 1-cent coin,
         two 5-cent coins and one 1-cent coin,
         one 5-cent coin and six 1-cent coins,
         or eleven 1-cent coins.
         So there are four unique ways to produce 11 cents.
         Assume that the cents parameter is always positive.
         */
        int[] count = new int[cents + 1];
        count[0] = 1; // caso de 1 cent
        for (int cent : new int[]{1, 5, 10, 25, 50}) {
            for (int i = 0; i + cent <= cents; i++) {
                count[i + cent] += count[i];
            }
        }
        return count[cents];
    }

    public static int getClosestToZero(int[] a) {
        /*
         Please implement this method to
         return the number in the array that is closest to zero.
         If there are two equally close to zero elements like 2 and -2
         - consider the positive element to be "closer" to zero.
         */
        if (a == null || a.length == 0) {
            return 0;
        }
        int closer = Integer.MAX_VALUE;
        for (int b : a) {
            int absB = Math.abs(b);
            int absC = Math.abs(closer);
            if (absB < absC) {
                closer = b;
            } else if (absC == absB) {
                closer = absB;
            }
        }
        return closer;

    }

    public static int sumOfTwoLargestElements(int[] a) {

        /*
         Please implement this method to
         return the sum of the two largest numbers in a given array.
         */
        if (a == null || a.length == 0) {
            return 0;
        }
        int larger = a[0];
        int largest = a[0];
        for (int b : a) {
            if (b > largest) {
                if (b > larger) {
                    larger = largest;
                }
                largest = b;
            } else if (b > larger) {
                larger = b;
            }
        }
        return (larger + largest);
    }

    public static List<Integer> getPrimeNumbers(int from, int to) {
        /*
         Please implement this method to
         return a list of all prime numbers in the given range (inclusively).
         A prime number is a natural number that has exactly two distinct natural number divisors, which are 1 and the prime number itself.
         The first prime numbers are: 2, 3, 5, 7, 11, 13
         */
        List<Integer> ret = new ArrayList<Integer>();
        Integer start = from;
        while (start <= to) {
            int divisores = 0;
            for (int i = 1; i <= start; i++) {
                if (start % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                ret.add(start);
            }
            start++;
        }
        return ret;
    }

    public static Object[] reverseArray(Object[] a) {
        /*
         Please implement this method to
         return a new array where the order of elements has been reversed from the original
         array.
         */
        if (a == null || a.length < 2) {
            return a;
        }

        for (int i = 0; i < a.length / 2; i++) {
            Object aux = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = aux;
        }
        return a;
    }

    public static class WriteOnceMap<K, V> extends HashMap<K, V> {

        @Override
        public V put(K key, V value) {
            /*
             WriteOnceMap is a map that does not allow changing value for a particular key.
             It means that put() method should throw IllegalArgumentException if the key is already
             assosiated with some value in the map.

             Please implement this method to conform to the above description of WriteOnceMap.
             */
            if (this.containsKey(key)) {
                throw new IllegalArgumentException("ya existe key");
            }

            return super.put(key, value);
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {
            /*
             Pleaase implement this method to conform to the description of WriteOnceMap above.
             It should either
             (1) copy all of the mappings from the specified map to this map or
             (2) throw IllegalArgumentException and leave this map intact
             if the parameter already contains some keys from this map.
             */
            for (K key : m.keySet()) {
                if (this.containsKey(key)) {
                    throw new IllegalArgumentException("ya existe key");
                }
            }
            super.putAll(m);
        }
    }

    public static boolean isPalindrome(String s) {
        /*
         Definition: A palindrome is a string that reads the same forward and backward.
         For example, "abcba" is a palindrome, "abab" is not.
         Please implement this method to
         return true if the parameter is a palindrome and false otherwise.
         */
        if (s == null || s.length() == 0) {
            return false;
        }
        //no haria falta convertirlo.
//        char[] sArray = s.toCharArray();
//        for (int i = 0; i < sArray.length / 2; i++) {
//            if (sArray[i] != sArray[sArray.length - 1 - i]) {
//                return false;
//            }
//        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static double getAverage(Node root) {
        /*
         Please implement this method to
         return the average of all node values (Node.getValue()) in the tree.
         */
        int count = deepChildCount(root);
        int sum = deepSum(root);
        if (count>0)
            return (double)sum/(count+1);
        else
            return 0;
    }
    
    private static int deepSum(Node root){
        if (root == null) {
            return 0;
        }
        int sumChilds = 0;
        for (Node child : root.getChildren()) {
            if (child.getChildren() != null && child.getChildren().size() > 0) {
                sumChilds += deepSum(child);
            } else {
                sumChilds += child.getValue();
            }
        }
        
        return (root.getValue() + sumChilds);
    }
    private static int deepChildCount(Node root){
        if (root == null) {
            return 0;
        }
        int countChilds = 0;
        for (Node child : root.getChildren()) {
            if (child.getChildren() != null){
                countChilds += deepChildCount(child);
                countChilds++;
            } else {
                countChilds++;
            }
        }
        
        return countChilds;
    }
    
    public static String reverseWords(String s) {
        /*
          Assume that the parameter String can only contain spaces and alphanumeric characters.
          Please implement this method to
          reverse each word in the original String while maintaining the word order.
          For example:
          parameter: "Hello world", result: "olleH dlrow"
         */
        String[] splitWords = s.split("\\s+");
        StringBuilder sb = new StringBuilder(s.length());
        for (String word : splitWords) {
            for (int i = 0; i < word.length(); i++) {
                sb.append(word.charAt(word.length() - i - 1));
            }
            sb.append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();
    }
}
