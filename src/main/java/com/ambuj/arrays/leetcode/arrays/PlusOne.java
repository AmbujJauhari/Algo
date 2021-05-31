package com.ambuj.arrays.leetcode.arrays;

import java.util.Arrays;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Example 3:
 * <p>
 * Input: digits = [0]
 * Output: [1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean incrementNextDigit = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                incrementNextDigit = true;
            } else {
                digits[i] = digits[i] + 1;
                incrementNextDigit = false;
                break;
            }
        }

        if (incrementNextDigit) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }

        return digits;
    }

    public static void main(String... args) {
        System.out.println(Arrays.toString(new PlusOne().plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9})));
    }
}
