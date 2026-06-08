package com.dsa.twopointers;

import java.util.Arrays;

/* Given a 1-indexed array of integers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. */
public class TwoPointers {

    public static int[] twoPointers(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int targetSum = arr[left] + arr[right];
            if (target == targetSum) {
                return new int[] { left + 1, right + 1 };
            } else if (targetSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(twoPointers(arr, 9)));

    }

}
