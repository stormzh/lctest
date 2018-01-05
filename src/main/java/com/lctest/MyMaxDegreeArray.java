package com.lctest;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class MyMaxDegreeArray {
    static int maxDegreeArray(int[] arr) {
        int maxLen = 1, degree = 1;
        HashMap<Integer, List<Integer>> res = new HashMap<Integer, List<Integer>>();

        for(int i=0; i<arr.length; i++) {
            if(!res.containsKey(arr[i])) {
                List<Integer> alist = new ArrayList<>();
                alist.add(i);
                res.put(arr[i], alist);
            }
            else 
                res.get(arr[i]).add(i);
        }

        for (int i:res.keySet()) {
            List<Integer> iList = res.get(i);
            int len = iList.get(iList.size()-1) - iList.get(0)+1;
            if(iList.size() > degree) {
                degree = iList.size();
                maxLen = len;
            }
            else if(iList.size() == degree ) {
                maxLen = maxLen>len? len:maxLen;
            }
        }
        return maxLen;
    }

}