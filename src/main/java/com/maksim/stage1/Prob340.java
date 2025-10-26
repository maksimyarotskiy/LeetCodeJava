package com.maksim.stage1;

import java.util.HashMap;
import java.util.Map;

public class Prob340 {
    public static int findLongestSubstring(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            while (map.size() > k) {
                if (map.get(s.charAt(left)) > 1) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                } else {
                    map.remove(s.charAt(left));
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
