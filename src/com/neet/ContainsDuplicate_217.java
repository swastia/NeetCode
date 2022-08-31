package com.neet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ContainsDuplicate_217 {

    /*Using sets is faster than using stacks, uses less memory
    This method is 91.73% faster and space used is 62% lesser
    * */
    public boolean containsDuplicateSet(int[] input) {
        //using sets
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<input.length; i++){
            // put in hashset
            if(!set.add(input[i])){
                return true;
            }
        }
        return false;
    }

    /*
    * using stacks is not efficient, it uses more space and sorting the array adds to time complexity*/
    public boolean containsDuplicateStack(int[] input) {

        boolean result = false;
        //sort the input
        Arrays.sort(input);
        // Push elements in stack, if a duplicate value occurs, return true
        Stack<Integer> stack = new Stack<>();

        for (int i : input) {
            if (stack.empty()) {
                stack.push(i);
            }
            else if(stack.peek() == i) {
                result = true;
            }else{
                stack.push(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ContainsDuplicate_217 duplicateCheck = new ContainsDuplicate_217();
        System.out.println(duplicateCheck.containsDuplicateSet(new int[]{1,2,3,4}));
        System.out.println(duplicateCheck.containsDuplicateStack(new int[]{1,2,3,4}));
    }
}
