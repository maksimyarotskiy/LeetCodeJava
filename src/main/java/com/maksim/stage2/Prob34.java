package com.maksim.stage2;

public class Prob34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = leftBoundary(nums, target);
        int right = rightBoundary(nums, target);

        return new int[] { left, right };
    }

    private static int leftBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }

    private static  int rightBoundary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
