package com.maksim;

import com.maksim.stage1.*;


public class Main {
    public static void main(String[] args) {
        String s = "aaabbbcccddddee";
        int k = 2;

        int res = Prob340.findLongestSubstring(s, k);
        System.out.println(res);
    }
}