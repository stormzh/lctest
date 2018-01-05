package com.lctest_vsc;

class MyPlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] + 1 == 10) {
            if (digits.length == 1) {
                int[] t = { 1, 0 };
                return t;
            } else
                return intArrayConcat(plusOne(reduceOneElement(digits)), 0);
        } else {
            digits[digits.length - 1]++;
            return digits;
        }
    }

    public static int[] intArrayConcat(int[] a, int b) {
        int[] res = new int[a.length + 1];
        for (int i = 0; i < a.length; i++)
            res[i] = a[i];
        res[a.length] = b;
        return res;
    }

    public static int[] reduceOneElement(int[] a) {
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++)
            b[i] = a[i];
        return b;
    }
}