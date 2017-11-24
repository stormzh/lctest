package com.lctest_vsc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linzhang on 7/29/17.
 * Modified by linzhang on 7/29/17
 */
class MyStringMatch {
    /*static ArrayList<String> str1;
    static ArrayList<Integer> minCnt;
    static ArrayList<Boolean> hasStar;

    static void decompStr(String str) {
        ArrayList<String> strArray = new ArrayList<>();
        String t = ".*";
        for (int i = 1, j = 0; i < str.length(); i++) {
            if (t.contains(String.valueOf(str.charAt(i)))
                    && !t.contains(String.valueOf(str.charAt(i - 1)))) { // .* substring ends
                strArray.add(str.substring(j, i - 1));
                j = i;
            } else if (!t.contains(String.valueOf(str.charAt(i)))
                    && t.contains(String.valueOf(str.charAt(i - 1)))) { //normal char ends
                strArray.add(str.substring(j, i - 1));
                j = i;
            } else {
                j++;
                continue;
            }
        }
        //return strArray;
    }*/

    static boolean myStrMatch(String a, String b) {
        int idx; //starting location where normal char lies
        int dotCnt = 0;
        boolean containStar = false;
        if (b.length() == 0)
            return true;
        for (idx = 0; idx < b.length(); idx++) {
            if (b.charAt(idx) == '.')  // current char is .
                dotCnt++;
            else if (b.charAt(idx) == '*')
                containStar = true;
            else
                break;
        }

        if (a.length() == 0 && dotCnt == 0)
            return true;
        if (a.length() < dotCnt)
            return false;
        if (dotCnt > 0 && !containStar)
            return myStrMatch(a.substring(dotCnt), b.substring(dotCnt));

        // contains Star or start with normal char
        List<Integer> mLoc = new ArrayList<>(); // all match location of c in a
        // this is the substring in b which doesn't have any wildcard
        int idx2; //starting location where next wildcard lies
        for (idx2 = idx; idx2 < b.length(); idx2++)
            if (b.charAt(idx2) == '.' || b.charAt(idx2) == '*')
                break;
        String c = b.substring(idx, idx2); // normal string without any wildcard
        if (c.length() == 0) //no more normal string
            return a.length() >= dotCnt;
        else if (!a.contains(c))
            return false;
        int k = dotCnt;
        while ((k = (a.indexOf(c, k) + 1)) > 0)
            mLoc.add(k-1);
        if (mLoc.size() == 0)
            return false;
        else {
            for (Integer t : mLoc)
                if (myStrMatch(a.substring(t + c.length()), b.substring(idx+c.length())))
                    return true;
            return false;
        }
    }
}