package com.maksim;

import com.maksim.stage1.*;
import com.maksim.stage2.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;// must be 2

        int[] nums1 = {1,3,5,6};
        int target1 = 2; // must be  1

        int res = Prob35.searchInsert(nums, target);
        int res1 = Prob35.searchInsert(nums1, target1);

        System.out.println(res);
        System.out.println(res1);
    }
}