package com.maksim.stage1;

public class TwoPoints {
    public static int[] findAnswer(int[] arrToReverse) {
        int left = 0;
        int right = arrToReverse.length - 1;

        while (left < right) {
            int temp = arrToReverse[left];
            arrToReverse[left] = arrToReverse[right];
            arrToReverse[right] = temp;

            left++;
            right--;
        }

        return arrToReverse;
    }
}
