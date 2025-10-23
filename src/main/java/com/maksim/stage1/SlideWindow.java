package com.maksim.stage1;

public class SlideWindow {
    public static int findMax(int[] nums, int k) {
        int maxSum = 0;

        for (int j = 0; j < k; j++) {
            maxSum += nums[j];
        }
        int sum = maxSum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
