package com.maksim.stage2;

public class Prob1150 {
    public static boolean isMajorityElement(int[] nums, int target) {
        int left = leftBoundary(nums, target);
        int right = rightBoundary(nums, target);

        if (left == -1 || right == -1) {
            return false;
        }

        int NumberCount = right - left + 1;
        return NumberCount > nums.length / 2;
    }

    private static int leftBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int currentLeft = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                currentLeft = mid;
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return currentLeft;
    }

    private static int rightBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int currenRight = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                currenRight = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return currenRight;
    }
    
}