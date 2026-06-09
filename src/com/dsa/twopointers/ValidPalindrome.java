package com.dsa.twopointers;

/* Valid Palindrome */
public class ValidPalindrome {

    public static boolean validPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        boolean output = false;

        if(s.length()==0 || s == null || s.length()==1){
            return true;
        }

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                output = true;
                left++;
                right--;
            } else{
                output = false;
                break;
            }
        }    
        return output;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
    
}
