package com.maksim.stage1;

import java.util.HashMap;
import java.util.Map;

public class Prob340 {
    public static int findLongestSubstring(String s, int k) {
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
    
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
        }

        return 1;
    }
}
