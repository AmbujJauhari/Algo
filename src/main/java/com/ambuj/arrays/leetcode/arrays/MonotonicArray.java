package com.ambuj.arrays.leetcode.arrays;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].  An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 * <p>
 * Return true if and only if the given array nums is monotonic.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,2,3]
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [6,5,4,4]
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,3,2]
 * Output: false
 * Example 4:
 * <p>
 * Input: nums = [1,2,4,5]
 * Output: true
 * Example 5:
 * <p>
 * Input: nums = [1,1,1]
 * Output: true
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= nums.length <= 50000
 * -100000 <= nums[i] <= 100000
 */
public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasingMonotonic = true;
        boolean isDecreasingMonotonic = true;

        if (nums.length == 1) {
            return true;
        }
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx + 1 < nums.length && nums[idx + 1] > nums[idx]) {
                isDecreasingMonotonic = false;
            } else if (idx + 1 < nums.length && nums[idx + 1] < nums[idx]) {
                isIncreasingMonotonic = false;
            }
        }
        return isIncreasingMonotonic || isDecreasingMonotonic;
    }

    public static void main(String... args) {
        int[] nums = {1,1,1, 87, 98, 139, 987, 1227};
        MonotonicArray monotonicArray = new MonotonicArray();
        System.out.println(monotonicArray.isMonotonic(nums));
    }
}

