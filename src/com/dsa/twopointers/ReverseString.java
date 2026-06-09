package com.dsa.twopointers;
/*Reverse String */
public class ReverseString {

    public static void main(String[] args) {
        String s = "yash raul";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        int left = 0;
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        char temp;
        

        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str = new String(arr);
        return str;
    }
    
}
