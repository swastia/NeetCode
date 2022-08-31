package com.neet.easy;

import java.util.Arrays;

public class ValidAnagram_242 {

    // first attempt - my solution
    // this is only 30% better - will try with HashMap approach and string comparison approach
    public boolean isAnagram(String s, String t) {

        // check size - if different, return false
        if(s.length() != t.length()){
            return false;
        }

        //sort both arrays and compare
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);

        int i = 0;
        while(i < sortedS.length){
            if(sortedS[i] != sortedT[i]){
                return false;
            }
            i++;
        }
        return true;
    }


    /*
    * Runtime: 6 ms, faster than 60.23% of Java online submissions for Valid Anagram.
    Memory Usage: 44.6 MB, less than 41.71% of Java online submissions for Valid Anagram.
* */

    public boolean isAnagramStringCompare(String s, String t){
        // check size - if different, return false
        if(s.length() != t.length()){
            return false;
        }

        //sort both arrays and compare
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);
        s = new String(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);
        t = new String(sortedT);

        return s.equals(t);
    }

    public static void main(String[] args) {
        ValidAnagram_242 anagram = new ValidAnagram_242();
        System.out.println(anagram.isAnagram("anagram", "nagaram"));
        System.out.println(anagram.isAnagram("swasti", "Swasti"));
        System.out.println(anagram.isAnagram("cat", "rat"));

        System.out.println("\n");

        System.out.println(anagram.isAnagramStringCompare("anagram", "nagaram"));
        System.out.println(anagram.isAnagramStringCompare("swasti", "Swasti"));
        System.out.println(anagram.isAnagramStringCompare("cat", "rat"));

    }
}
