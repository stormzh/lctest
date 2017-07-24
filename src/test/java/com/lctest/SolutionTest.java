package com.lctest;

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
        double res = sol.findMedianSortedArrays(new int[]{1}, new int[]{2});
        double trures = 1.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2}, new int[]{2,3});
        trures = 2;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,3,4,5,6}, new int[]{2,3});
        trures = 3;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,3,4,5,6}, new int[]{2,3,4});
        trures = 3;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,3,4,5,6,9,10}, new int[]{-1,2,3});
        trures = 3;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,3,4,5,6,9,10,11}, new int[]{2,3,4});
        trures = 4;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{4,5,6,7,8,9,10,11,14,15}, new int[]{2,3,4,5});
        trures = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{4,5,6,7,8,9,10,11}, new int[]{2,3,4});
        trures = 6;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{-1,2,4,5,6,7,8,9,10,11}, new int[]{2,3,8,9});
        trures = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{-5,-4,-3, -1,2,4,5,6,7,8,9,10,11}, new int[]{2,3,7, 8,9,11,100});
        trures = 6.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{-5,-4,-3, -1,2,4,5,6,7,8,9,10,11}, new int[]{2,3,7,8,9,10, 11,100});
        trures = 7;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,3,6,7,10,15,80}, new int[]{2,4,5,10,20,32,100});
        trures = 8.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,5,6,7}, new int[]{2,3,4,8,9,10});
        trures = 5.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,4}, new int[]{3,5,6,7});
        trures = 4;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{2,2,2}, new int[]{2,2,2,2});
        trures = 2;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,7}, new int[]{3,4,5,6});
        trures = 4;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

        res = sol.findMedianSortedArrays(new int[]{1,2,6,7}, new int[]{3,4,5,8});
        trures = 4.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);

    }
}