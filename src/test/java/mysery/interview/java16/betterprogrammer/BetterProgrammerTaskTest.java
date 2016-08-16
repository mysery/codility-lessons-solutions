/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.java16.betterprogrammer;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mysery
 */
public class BetterProgrammerTaskTest {
    
    /**
     * Test of retainPositiveNumbers method, of class BetterProgrammerTask.
     */
    @Test
    public void testRetainPositiveNumbers() {
        int[] a = new int[]{-1,5,1,2,-5,3,5};
        int[] expResult = new int[]{1,2,3,5,5};
        int[] result = BetterProgrammerTask.retainPositiveNumbers(a);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of countWords method, of class BetterProgrammerTask.
     */
    @Test
    public void testCountWords() {
        String s = "asa asa as";
        int expResult = 3;
        int result = BetterProgrammerTask.countWords(s);
        assertEquals(expResult, result);
        s = "asa    asa as";
        expResult = 3;
        result = BetterProgrammerTask.countWords(s);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRequiredNumberOfBits method, of class BetterProgrammerTask.
     */
    @Test
    public void testGetRequiredNumberOfBits() {
        System.out.println("getRequiredNumberOfBits");
        int N = 5;
        int expResult = 3;
        int result = BetterProgrammerTask.getRequiredNumberOfBits(N);
        assertEquals(expResult, result);
    }

    /**
     * Test of reverse method, of class BetterProgrammerTask.
     */
    @Test
    public void testReverse() {
        BetterProgrammerTask.ListNode node = createListNode();
        BetterProgrammerTask.ListNode expResult = null;
        BetterProgrammerTask.ListNode result = BetterProgrammerTask.reverse(node);
    }

    class TestListNode implements BetterProgrammerTask.ListNode {
        private int item;
        private BetterProgrammerTask.ListNode next;

        public TestListNode(int item, BetterProgrammerTask.ListNode next) {
            this.item = item;
            this.next = next;
        }
        
            @Override
            public int getItem() {
                return item;
            }

            @Override
            public BetterProgrammerTask.ListNode getNext() {
                return next;
            }

            @Override
            public void setNext(BetterProgrammerTask.ListNode next) {
                this.next = next;
            }

        @Override
        public String toString() {
            if (next == null) return "node: " + item+" ;";
            return "node: " + item + " next: "+ next.toString();
        }
            
        }
    private BetterProgrammerTask.ListNode createListNode() {
        TestListNode fiveth = new TestListNode(5, null);
        TestListNode fourth = new TestListNode(4, fiveth);
        TestListNode thirth = new TestListNode(3, fourth);
        TestListNode second = new TestListNode(2, thirth);
        TestListNode root = new TestListNode(1, second);
        return root;
    }

    /**
     * Test of countWaysToProduceGivenAmountOfMoney method, of class BetterProgrammerTask.
     */
    @Test
    public void testCountWaysToProduceGivenAmountOfMoney() {
        int cents = 11;
        int expResult = 4;
        int result = BetterProgrammerTask.countWaysToProduceGivenAmountOfMoney(cents);
        assertEquals(expResult, result);
        assertEquals(292 , BetterProgrammerTask.countWaysToProduceGivenAmountOfMoney(100));
        assertEquals(50 , BetterProgrammerTask.countWaysToProduceGivenAmountOfMoney(50));
        
    }

    /**
     * Test of getClosestToZero method, of class BetterProgrammerTask.
     */
    @Test
    public void testGetClosestToZero() {
        int[] a = new int[]{-1,5,1,-5};
        assertEquals(1, BetterProgrammerTask.getClosestToZero(a));
        a = new int[]{-2,-5,-3,-1};
        assertEquals(-1, BetterProgrammerTask.getClosestToZero(a));
        a = new int[]{5,6,3,2};
        assertEquals(2, BetterProgrammerTask.getClosestToZero(a));
        a = new int[]{-65654,65654,54,-54,0};
        assertEquals(0, BetterProgrammerTask.getClosestToZero(a));
        a = new int[]{0};
        assertEquals(0, BetterProgrammerTask.getClosestToZero(a));
    }

    /**
     * Test of sumOfTwoLargestElements method, of class BetterProgrammerTask.
     */
    @Test
    public void testSumOfTwoLargestElements() {
        int[] a = new int[]{-1,5,1,-5};
        assertEquals(5+1, BetterProgrammerTask.sumOfTwoLargestElements(a));
        a = new int[]{-2,-5,-3,-1};
        assertEquals(-1-2, BetterProgrammerTask.sumOfTwoLargestElements(a));
        a = new int[]{5,6,3,2};
        assertEquals(6+5, BetterProgrammerTask.sumOfTwoLargestElements(a));
        a = new int[]{-65654,65654,54,-54,0};
        assertEquals(65654+54, BetterProgrammerTask.sumOfTwoLargestElements(a));
        a = new int[]{0};
        assertEquals(0, BetterProgrammerTask.sumOfTwoLargestElements(a));
        a = new int[]{5,5};
        assertEquals(5+5, BetterProgrammerTask.sumOfTwoLargestElements(a));
    }

    /**
     * Test of getPrimeNumbers method, of class BetterProgrammerTask.
     */
    @Test
    public void testGetPrimeNumbers() {
        int from = 1;
        int to = 13;
        List<Integer> expResult = Arrays.asList(new Integer[]{2, 3, 5, 7, 11, 13});
        List<Integer> result = BetterProgrammerTask.getPrimeNumbers(from, to);
        assertEquals(expResult, result);
    }

    /**
     * Test of reverseArray method, of class BetterProgrammerTask.
     */
    @Test
    public void testReverseArray() {
        Integer[] a = new Integer[]{6,5,3,2,1};
        Integer[] expResult = new Integer[]{1,2,3,5,6};
        assertArrayEquals(expResult, BetterProgrammerTask.reverseArray(a));
        a = new Integer[]{1,2};
        expResult = new Integer[]{2,1};
        assertArrayEquals(expResult, BetterProgrammerTask.reverseArray(a));
        a = new Integer[]{1};
        expResult = new Integer[]{1};
        assertArrayEquals(expResult, BetterProgrammerTask.reverseArray(a));
        a = new Integer[]{1,2,3,4};
        expResult = new Integer[]{4,3,2,1};
        assertArrayEquals(expResult, BetterProgrammerTask.reverseArray(a));
    }

    /**
     * Test of isPalindrome method, of class BetterProgrammerTask.
     */
    @Test
    public void testIsPalindrome() {
        assertEquals(true, BetterProgrammerTask.isPalindrome("a"));
        assertEquals(true, BetterProgrammerTask.isPalindrome("aba"));
        assertEquals(true, BetterProgrammerTask.isPalindrome("abcba"));
        assertEquals(false, BetterProgrammerTask.isPalindrome("abab"));
        assertEquals(true, BetterProgrammerTask.isPalindrome("abcxcxcba"));
        assertEquals(false, BetterProgrammerTask.isPalindrome("abccxcba"));
        assertEquals(false, BetterProgrammerTask.isPalindrome(""));
    }

    /**
     * Test of getAverage method, of class BetterProgrammerTask.
     */
    @Test
    public void testGetAverage() {
        List<BetterProgrammerTask.Node> childs1 = (List)Arrays.asList(new TreeNode[]{
            new TreeNode( null, 5),
        });
        List<BetterProgrammerTask.Node> childs2 = (List)Arrays.asList(new TreeNode[]{
            new TreeNode( null, 2),
            new TreeNode( null, 3),
            new TreeNode( childs1, 4),
        });
        TreeNode root = new TreeNode( childs2, 1);
        double expResult = 3D;
        double result = BetterProgrammerTask.getAverage(root);
        assertEquals(expResult, result, 0.001);
    }
    
    public class TreeNode implements BetterProgrammerTask.Node {

        List<BetterProgrammerTask.Node> children;
        int value;

        public TreeNode(List<BetterProgrammerTask.Node> children, int value) {
            this.children = children;
            this.value = value;
        }

        @Override
        public List<BetterProgrammerTask.Node> getChildren() {
            return children;
        }

        @Override
        public int getValue() {
            return value;
        }

    }

    /**
     * Test of reverseWords method, of class BetterProgrammerTask.
     */
    @Test
    public void testReverseWords() {
        assertEquals("olleH dlroW", BetterProgrammerTask.reverseWords("Hello World"));
        assertEquals("olleH dlroW syug", BetterProgrammerTask.reverseWords("Hello World guys"));
        assertEquals("holaquetal", BetterProgrammerTask.reverseWords("lateuqaloh"));
        assertEquals("hola que tal", BetterProgrammerTask.reverseWords("aloh euq lat"));
    }
    
}
