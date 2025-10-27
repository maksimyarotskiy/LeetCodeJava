package com.maksim.stage2;

public class Prob35 {
    public static int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return left;
    }
}
