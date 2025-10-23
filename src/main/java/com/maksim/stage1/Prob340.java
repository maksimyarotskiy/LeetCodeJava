package com.maksim.stage1;

import java.util.HashMap;
import java.util.Map;

public class Prob340 {
    public static int findLongestSubstring(String s, int k) {
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int right;

        for (right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            if (map.size() > k) {
                while (map.size() > k) {
                    if (map.get(s.charAt(left)) == 1) {
                        map.remove(s.charAt(left));
                    } else {
                        map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    }
                }
                left++;
                if (maxLength < (right - left + 1)) {
                    maxLength = right - left + 1;
                }
            }

        }

        return maxLength;
    }
}
