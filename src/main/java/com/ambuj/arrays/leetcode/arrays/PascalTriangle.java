package com.ambuj.arrays.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * <p>
 * Input: numRows = 1
 * Output: [[1]]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 * Accepted
 * 498,617
 * Submissions
 * 886,021
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>(numRows);
        Integer[] nextRow = null;
        //create a triangle first
        for (int i = 0; i < numRows; i++) {
            if (nextRow == null) {
                nextRow = new Integer[i + 1];
            }

            Integer[] currentRow = nextRow;
            currentRow[0] = 1;
            currentRow[currentRow.length - 1] = 1;
            pascalTriangle.add(Arrays.asList(currentRow));
            if (i < numRows - 1) {
                nextRow = new Integer[i + 2];
                for (int j = 0; j < currentRow.length; j++) {
                    if (j + 1 < currentRow.length) {
                        nextRow[j + 1] = currentRow[j] + currentRow[j + 1];
                    }
                }
            }
        }

        return pascalTriangle;
    }

    public static void main(String... args) {
        System.out.println(new PascalTriangle().generate(10));
    }
}
