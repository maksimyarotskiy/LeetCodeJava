package com.maksim.stage2;

public class Prob278 {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else if (!isBadVersion(mid)) {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean isBadVersion(int n) {
        return true;
    }
}
