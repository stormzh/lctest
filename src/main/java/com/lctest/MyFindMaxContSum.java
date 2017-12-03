package com.lctest;

class MyFindMaxContSum {
    static int findMaxContSum(int[] arr) {
        if(arr.length == 0)
            return 0;
        int sum = arr[0], psum = sum;
        for(int i=1; i<arr.length; i++) {
            if((arr[i-1]<0 && arr[i]>0 || arr[i]<=0) && psum<0)
                psum = arr[i];
            else
                psum += arr[i];
            sum = psum>sum? psum:sum;
        }
        return sum;
    }
}