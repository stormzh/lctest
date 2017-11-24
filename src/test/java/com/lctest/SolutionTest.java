package com.lctest_vsc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by linzhang on 7/15/17.
 * Modified by linzhang on 7/15/17
 */
public class SolutionTest {

    @Test
    public void findMedianSortedArraysTest() {
        Solution sol = new Solution();
        double result = sol.findMedianSortedArrays(new int[]{1}, new int[]{2});
        double trueResult = 1.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2}, new int[]{2, 3});
        trueResult = 2;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 3});
        trueResult = 3;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 3, 4});
        trueResult = 3;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6, 9, 10}, new int[]{-1, 2, 3});
        trueResult = 3;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5, 6, 9, 10, 11}, new int[]{2, 3, 4});
        trueResult = 4;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 14, 15}, new int[]{2, 3, 4, 5});
        trueResult = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{4, 5, 6, 7, 8, 9, 10, 11}, new int[]{2, 3, 4});
        trueResult = 6;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{-1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{2, 3, 8, 9});
        trueResult = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{-5, -4, -3, -1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{2, 3, 7, 8, 9, 11, 100});
        trueResult = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{-5, -4, -3, -1, 2, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{2, 3, 7, 8, 9, 10, 11, 100});
        trueResult = 7;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 3, 6, 7, 10, 15, 80}, new int[]{2, 4, 5, 10, 20, 32, 100});
        trueResult = 8.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 5, 6, 7}, new int[]{2, 3, 4, 8, 9, 10});
        trueResult = 5.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 4}, new int[]{3, 5, 6, 7});
        trueResult = 4;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{2, 2, 2}, new int[]{2, 2, 2, 2});
        trueResult = 2;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 7}, new int[]{3, 4, 5, 6});
        trueResult = 4;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

        result = sol.findMedianSortedArrays(new int[]{1, 2, 6, 7}, new int[]{3, 4, 5, 8});
        trueResult = 4.5;
        System.out.println("@Test findMedianSortedArrays(): " + result + " = " + trueResult);
        assertTrue(trueResult == result);

    }

    @Test
    public void stringMatchTest() {
        Solution sol = new Solution();
        boolean result = sol.stringMatch("abcde", "ab");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("abcde", "a*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("abcde", "a.");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("abcde", ".a");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.stringMatch("abcde", "a.*b");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.stringMatch("abcde", ".*bc.*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("abcdeab", ".ab*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("bcabcdeab", ".ab..*b.");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.stringMatch("bcabcdeab", ".ab..*a.");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("bcabcdeab", "b.*ab.*.*a.");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("bcabcdeabe12sa", "b.*ab.*.*a.*b");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.stringMatch("bcabcdeabe12sa", "b.*ab.*.*a.*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.stringMatch("aa", "a");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);
    }

    @Test
    public void strRXMatchTest() {
        Solution sol = new Solution();
        boolean result = sol.strRXMatch("aa", "a");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.strRXMatch("aa", "aa");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("aaa", "aa");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.strRXMatch("aa", "a*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("aa", ".*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("ab", ".*");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("aab", "c*a*b");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("ab", ".*c");
        System.out.println("@Test stringMatch(): " + result + " = " + false);
        assertTrue(false == result);

        result = sol.strRXMatch("aaa", "ab*ac*a");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);

        result = sol.strRXMatch("aaa", "ab*a*c*a");
        System.out.println("@Test stringMatch(): " + result + " = " + true);
        assertTrue(true == result);
    }
}