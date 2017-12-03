package com.lctest;

import java.util.ArrayList;

class Solution {
    double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if(len1 == 0)
            return MyMedian.medOfSortedArray(nums2);
        if(len2 == 0)
            return MyMedian.medOfSortedArray(nums1);
        if(len1<=len2)
            return MyMedian.medOfTwoSortedArray(nums1, MyMedian.reduceArray(nums1,nums2));
        else
            return MyMedian.medOfTwoSortedArray(nums2, MyMedian.reduceArray(nums2,nums1));
    }

    boolean stringMatch(String a, String b) {
        //decompose b to list of strings according to the char "." or "*"
        return MyStringMatch.myStrMatch(a,b);
    }

    boolean strRXMatch(String a, String b) {
        //decompose b to list of strings according to the char "." or "*"
        return MyStrRXMatch.myStrRXMatch(a,b);
    }

    int findMaxContSum(int[] a) {
        return MyFindMaxContSum.findMaxContSum(a);
    }

    int maxDegreeArray(int[] a) {
        return MyMaxDegreeArray.maxDegreeArray(a);
    }
}
