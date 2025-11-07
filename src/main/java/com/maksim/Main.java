package com.maksim;

import java.util.Arrays;

import com.maksim.stage2.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = Prob34.searchRange(nums, target);

        System.out.println(Arrays.toString(res));//4

    }
}