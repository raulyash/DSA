package com.dsa.twopointers;

import java.util.Arrays;

/* Sorted square using an extra space */
public class SortedSquareExtraSpace {

    public static int[] sortedSquare(int[] arr) {
        int[] outputArr = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        int maxIndex = outputArr.length - 1;

        if(arr.length==1){
            outputArr[maxIndex] = arr[0] * arr[0];
        }

        while (left <= right) {
            if (Math.abs(arr[left]) < Math.abs(arr[right])) {
                outputArr[maxIndex] = arr[right] * arr[right];
                maxIndex--;
                right--;
            } else {
                outputArr[maxIndex] = arr[left] * arr[left];
                maxIndex--;
                left++;
            }
        }

        return outputArr;

    }

    public static void main(String[] args) {

        int[] arr = {-7, -2, 1, 6, 8};
        System.out.println(Arrays.toString(sortedSquare(arr)));
    }
}
