package com.neet.easy;

/*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.
*
* Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
* */

import java.util.*;

public class GroupAnagrams_49 {


    /*Runtime: 8 ms, faster than 90.90% of Java online submissions for Group Anagrams.
Memory Usage: 56.9 MB, less than 32.12% of Java online submissions for Group Anagrams.
*/
    public List<List<String>> groupAnagrams01(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        //if input is blank, return empty list

        if(strs.length==0){
            return result;
        }

        // sort all strings in the list, put sorted lists in hashmap with indices,
        //compare similar strings
        Map<String, List<String>> mapSublist = new HashMap<>();
        for (String str: strs) {
            char[] hash = new char[26];
            for (char ch: str.toCharArray()) {
                hash[ch - 'a']++;
            }
            String key = new String(hash);
            mapSublist.computeIfAbsent(key, k -> new ArrayList<>());
            mapSublist.get(key).add(str);
        }

        result.addAll(mapSublist.values());

        return result;
    }

    public static void main(String[] args) {
        GroupAnagrams_49 anagrams = new GroupAnagrams_49();
        System.out.println(anagrams.groupAnagrams01(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(anagrams.groupAnagrams01(new String[]{"a"}));
        System.out.println(anagrams.groupAnagrams01(new String[]{}));
    }
}
