package com.lctest;

import java.util.Arrays;
/**
 * Created by linzhang on 7/22/17.
 * Modified by linzhang on 7/22/17
 * Assuming the two arrays have same or close size
 */
class MyMedian {
    static double medOfSortedArray (int [] a) {
        int len = a.length;
        if(len > 0)
            return (len%2 == 0? (a[len/2 - 1] + a[len/2])/2.0:a[(len-1)/2]);
        else
            return 0;  //empty array
    }

    static double medOfTwoSortedArray (int[] a, int[] b) {
        // similar size, b.len==a.len or a.len+1 or a.len+2
        int len1 = a.length, len2 = b.length;
        if (len1 == 0)
            return medOfSortedArray(b);
        if(len1 <=2) { // merge sort and then find Median
            int[] c = new int[len1 + len2];
            System.arraycopy(a,0, c, 0,len1);
            System.arraycopy(b, 0, c, len1,len2);
            Arrays.sort(c);
            return medOfSortedArray(c);
        }
        if(len1 == len2) {
            int[] c = new int[len1/2];
            int[] d = new int[len1/2];
            if(medOfSortedArray(a) <= medOfSortedArray(b)) {
                System.arraycopy(a,len1/2, c, 0,(len1+1)/2);
                System.arraycopy(b, 0, d, 0,(len1+1)/2);
            } else {
                System.arraycopy(a,0, d, 0,(len1+1)/2);
                System.arraycopy(b, len1/2, d, 0,(len1+1)/2);
            }
            return medOfTwoSortedArray(c, d);
        } else if(len1 ==len2 -1){
            int k = len1 / 2;
            int[] c = new int[k];
            int[] d = new int[k + 1];
            if (len1 % 2 == 0) { //len1=2k and len2=2k+1
                if (b[k] <= a[k - 1]) {
                    System.arraycopy(a,0, c, 0,k);
                    System.arraycopy(b, k, d, 0,k+1);
                } else if (b[k] >= a[k]) {
                    System.arraycopy(a,k, c, 0,k);
                    System.arraycopy(b, 0, d, 0,k+1);
                } else
                    return b[k];
            } else { //len1=2k+1 and len2=2k+2
                if (a[k] <= b[k]) {
                    System.arraycopy(a,k, c, 0,k);
                    System.arraycopy(b, 0, d, 0,k+1);
                } else if (a[k] >= b[k + 1]) {
                    System.arraycopy(a,0, c, 0,k);
                    System.arraycopy(b, k, d, 0,k+1);
                } else
                    return a[k];
            }
            return medOfTwoSortedArray(c, d);
        } else { // len1 == len2-2
            int k = (len1-1)/2 + 1;
            if(len1%2 != 0) { //case one: both odd
                int[] c = new int[k];
                int[] d = new int[k + 2];
                if (a[k-1] <= b[k]) {
                    System.arraycopy(a,k-1, c, 0,k);
                    System.arraycopy(b, 0, d, 0,k+2);
                } else {
                    System.arraycopy(a,0, c, 0,k);
                    System.arraycopy(b, k-1, d, 0,k+2);
                }
                return medOfTwoSortedArray(c, d);
            } else { // case two: both even
                if (a[k - 1] <= b[k]) {
                    int[] c = new int[k];
                    int[] d = new int[k + 2];
                    System.arraycopy(a,k, c, 0,k);
                    System.arraycopy(b, 0, d, 0,k+2);
                    return medOfTwoSortedArray(c, d);
                } else {
                    int[] c = new int[k + 1];
                    int[] d = new int[k + 3];
                    System.arraycopy(a,0, c, 0,k+1);
                    System.arraycopy(b, k, d, 0,k+3);
                    return medOfTwoSortedArray(c, d);
                }
            }
        }

    }

    static int[] reduceArray (int[] a, int[] b) { //asuming len(a)<=len(b)
        int len1 = a.length, len2 = b.length;
        int[] c;
        if(len1 > len2-2) //differnce is <2, no need to reduce b
            return b;
        else {
            int k=len1/2, m=len2/2;
            if((len1+len2)%2 == 0) { //both even or odd
                c = new int[len1+2];
                System.arraycopy(b, m - k - 1, c, 0, len1 + 2);
            } else { //one even, one odd
                c = new int[len1+1];
                System.arraycopy(b, m - k - len1 % 2, c, 0, len1 + 1);
            }
            return c;
        }
    }
}
