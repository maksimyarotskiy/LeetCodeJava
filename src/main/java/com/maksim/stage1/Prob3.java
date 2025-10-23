package com.maksim.stage1;

import java.util.HashSet;
import java.util.Set;

public class Prob3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                right++;
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
//    public static int lengthOfLongestSubstring(String s) {
//        Set<Character> hashset = new HashSet<>();
//        int left = 0;
//        int right = 0;
//        int maxLength = 0;
//        int currentLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (!hashset.contains(s.charAt(right))) {
//                hashset.add(s.charAt(right));
//                right++;
//            } else if (hashset.contains(s.charAt(right))) {
//                while (hashset.contains(s.charAt(right))) {
//                    hashset.remove(s.charAt(left));
//                    left++;
//                }
//                hashset.add(s.charAt(right));
//                right++;
//            }
//
//            currentLength = hashset.size();
//            if (maxLength < currentLength) {
//                maxLength = currentLength;
//            }
//
//        }
//        System.out.println(hashset.size());
//        System.out.println(hashset);
//        return maxLength;
//
//
//
//    }

}