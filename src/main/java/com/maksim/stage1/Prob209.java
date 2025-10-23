package com.maksim.stage1;

public class Prob209 {
    public static int minSubArrayLen(int[] nums, int target) {
        int minLength = 0;
        int left = 0;
        int currentSum = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            if (currentSum >= target) {
                if (minLength == 0) {
                    minLength = right + 1 - left;
                }
                while (currentSum >= target) {
                    currentSum -= nums[left];
                    left++;
                    if (currentSum >= target && minLength > (right + 1 - left)) {
                        minLength = right + 1 - left;
                    }
                }

            }
        }

        return minLength;
    }
}
