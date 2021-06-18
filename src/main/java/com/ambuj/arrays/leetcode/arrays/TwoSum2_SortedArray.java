package com.ambuj.arrays.leetcode.arrays;

import java.util.Arrays;

/**
 * Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
 * <p>
 * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Example 3:
 * <p>
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= numbers.length <= 3 * 104
 * -1000 <= numbers[i] <= 1000
 * numbers is sorted in non-decreasing order.
 * -1000 <= target <= 1000
 * The tests are generated such that there is exactly one solution.
 */
public class TwoSum2_SortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int firstIdx = 0, lastIdx = numbers.length - 1;
        int[] result = new int[2];
        while (firstIdx < lastIdx) {
            int sum = numbers[firstIdx] + numbers[lastIdx];
            if (sum == target) {
                result[0] = firstIdx+1;
                result[1] = lastIdx+1;
                break;
            } else if (sum < target) {
                firstIdx++;
            } else {
                lastIdx--;
            }

        }

        return result;
    }

    public static void main(String... args) {
        System.out.println(Arrays.toString(new TwoSum2_SortedArray().twoSum(new int[]{-1,0}, -1)));
    }
}
