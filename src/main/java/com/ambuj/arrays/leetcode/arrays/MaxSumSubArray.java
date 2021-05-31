package com.ambuj.arrays.leetcode.arrays;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has
 * the largest sum and return its sum.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 * <p>
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the
 * divide and conquer approach, which is more subtle.
 */

//Hint: Kadane's Algorithm
public class MaxSumSubArray {
    //-2,1,-3,4,-1,2,1,-5,4
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int largestSum = nums[0];

        for (int idx = 1; idx < nums.length; idx++) {
            currentSum = currentSum + nums[idx];
            if(currentSum < nums[idx]) {
                currentSum = nums[idx];
            }
            if (currentSum > largestSum) {
                largestSum = currentSum;
            }
        }

        return largestSum;
    }

    public static void main(String... args) {
        System.out.println(new MaxSumSubArray().maxSubArray(new int[]{5,4,1,7,8}));
    }
}
