package com.maksim;

import com.maksim.stage1.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int res = Prob209.minSubArrayLen(nums, target);
        System.out.println(res);

    }
}