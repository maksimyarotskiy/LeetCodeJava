package com.maksim.stage1;

public class Prob643 {
    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum = maxSum + nums[i];
        }
        int sum = maxSum;

        for (int j = k; j < nums.length; j++) {
            sum = sum - nums[j - k] + nums[j];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }
}
