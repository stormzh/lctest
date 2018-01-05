package com.lctest;

//import java.util.ArrayList;
//import java.util.List;


class MyStrRXMatch {

    static boolean myStrRXMatch(String a, String b) {

        if (b.length() == 0)
            return (a.length() == 0);

        if(b.length() >= 2) { // at least two chars in the pattern string
            if(b.charAt(1) != '*') {
                if(b.charAt(0) == a.charAt(0) || b.charAt(0) == '.')
                    return myStrRXMatch(a.substring(1), b.substring(1));
                else
                    return false;
            }
            else { // next char is a '*'
                if(a.length() == 0)
                    return myStrRXMatch(a, b.substring(2));
                int sameChar = findSameChar(a);
                if(b.charAt(0) == '.' && b.length() == 2) // '.*'
                    return true;
                else if(b.charAt(0) == '.' ) {//&& ) {
                    myStrRXMatch(a.substring(a.length()>=2?2:1), b.substring(2));
                    }
                else {  // '?*'
                    boolean res=false;
                    if(b.charAt(0) == a.charAt(0)) {
                        for(int j=0; j<=sameChar; j++)
                            res = res || myStrRXMatch(a.substring(j), b.substring(2));
                    }
                    return res;
                }
            }
        }
        else { //b only has one char, no '*'
            if (b.charAt(0) == '.')
                return a.length() == 1;
            else {
                if (a.length() > 1)
                    return false;
                else
                    if(a.length()> 0)
                        return b.charAt(0) == a.charAt(0);
                    else
                        return false;
            }
        }
        return true; // not complete
    }

    //find the index of the same char at the beginning of the string a
    static int findSameChar(String a) {
        int idx, i;
        if(a.length() <= 1) // single-char or empty string
            idx = 0;
        else {
            for (i = 1; i < a.length(); i++)
                if (a.charAt(i) != a.charAt(i - 1))
                    break;
            idx = i;
        }
        return idx;
    }
}