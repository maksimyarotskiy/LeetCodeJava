package com.maksim;

import com.maksim.stage1.*;
import com.maksim.stage2.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int res = Prob704.search(nums, target);
        System.out.println(res); //must be 4
    }
}