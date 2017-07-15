package com.lctest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by linzhang on 7/15/17.
 * Modified by linzhang on 7/15/17
 */
public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        Solution sol = new Solution();
        int[] a1 = {1};
        int[] a2 = {2};
        double res = sol.findMedianSortedArrays(a1, a2);
        double trures = 1.5;
        System.out.println("@Test findMedianSortedArrays(): " + res + " = " + trures);
        assertTrue(trures == res);
    }
}