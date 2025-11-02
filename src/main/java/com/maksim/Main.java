package com.maksim;

import com.maksim.stage2.*;


public class Main {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int res = Prob33.search(nums, target);

        System.out.println(res);//4

    }
}