package com.ambuj.arrays.algoexpert;

import java.util.Arrays;

/**
 *
 */

// Works the same for moving element
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int startIdx = 0;
        int endIdx = nums.length - 1;

        if(nums.length == 1) {
            if(nums[0] == val) {
                return 0;
            }
            return nums.length;
        }

        while (startIdx <= endIdx) {
            if (val == nums[startIdx] && nums[startIdx] == nums[endIdx]) {
                endIdx--;
            } else if (val == nums[startIdx] && nums[startIdx] != nums[endIdx]) {
                //swap elements
                int c = nums[endIdx];
                nums[endIdx] = nums[startIdx];
                nums[startIdx] = c;
                startIdx++;
            } else {
                startIdx++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(startIdx);

        return startIdx;
    }

    public static void main(String... args) {
        int[] nums = {3,2,2,3};
        int toMove = 3;
        RemoveElement removeElement = new RemoveElement();
        removeElement.removeElement(nums, toMove);
        System.out.println(Arrays.toString(nums));

    }

}
