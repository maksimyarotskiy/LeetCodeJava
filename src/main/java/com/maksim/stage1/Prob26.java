package com.maksim.stage1;

public class Prob26 {
    public static int removeDuplicates(int[] nums, int val) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }



        return slow;
    }
}
