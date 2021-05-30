package com.ambuj.arrays.leetcode.arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:
 * <p>
 * Input: nums = [1], target = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            }

            if (nums[i] >= target) {
                break;
            }
        }

        return i;

    }

    public static void main(String... args) {
        int nums[] = {1};

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(nums, 0));
    }
}
