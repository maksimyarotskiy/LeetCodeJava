package com.maksim.stage1;

public class Palindrome {
    public static boolean isPalindrome (String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left += 1;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right -= 1;
            }


            if (Character.toLowerCase(text.charAt(left))!= Character.toLowerCase(text.charAt(right))) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}
