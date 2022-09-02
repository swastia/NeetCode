package com.neet.easy;

public class ValidPalindrome_125 {

    // Refined method without built in methods used, and using constant space

    /*
    * Runtime: 6 ms, faster than 67.92% of Java online submissions for Valid Palindrome.
    Memory Usage: 43.6 MB, less than 69.53% of Java online submissions for Valid Palindrome.
* */
    public boolean isPalindromeRefined(String s) {
        // here, use 2 pointers to traverse the string from front and back
        // convert uppercase to lower
        int i = 0, j= s.length()-1;

        while(i<j){
            Character start = s.charAt(i);
            Character end = s.charAt(j);

            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }

            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /*
    * First- attempt solution
    * Runtime: 37 ms, faster than 39.10% of Java online submissions for Valid Palindrome.
      Memory Usage: 48 MB, less than 19.94% of Java online submissions for Valid Palindrome.
    * */

    /*Doing regex before converting the string to lower case degrades the performance of the program*/
    public boolean isPalindrome(String s) {
        // convert uppercase to lower
        String clean = s.toLowerCase();
        // remove all non numeric characters
        clean = clean.replaceAll("[^a-z0-9]", "");

        // reverse the string
        char[] cleanS = clean.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for(int i = cleanS.length-1; i>=0; i--){
            reversed.append(cleanS[i]);
        }

        return clean.equals(reversed.toString());
    }

    public static void main(String[] args) {
        ValidPalindrome_125 palindrome = new ValidPalindrome_125();
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(palindrome.isPalindrome("race a car"));

        System.out.println(palindrome.isPalindromeRefined("\n A man, a plan, a canal: Panama"));
        System.out.println(palindrome.isPalindromeRefined("race a car"));
    }
}
