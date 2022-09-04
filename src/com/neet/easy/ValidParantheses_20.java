package com.neet.easy;

/*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
*  determine if the input string is valid.
* */

import java.util.Stack;

public class ValidParantheses_20 {
    public boolean isValid(String s) {
        // if number of brackets are odd, then it cannot be valid
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        // if any character in the string is not a bracket, string is invalid - (,),{,},[,]
        for(int i=0; i<s.toCharArray().length; i++){
            char current = s.charAt(i);
            if (stack.isEmpty() && (current == ')' || current == '}' || current == ']')){
                return false;
            } else if(!stack.isEmpty()){
                if(stack.peek() == '(' && current == ')'){
                    stack.pop();
                } else if(stack.peek() == '{' && current == '}'){
                    stack.pop();
                } else if(stack.peek() == '[' && current == ']'){
                    stack.pop();
                } else{
                    stack.push(current);
                }
            } else{
                stack.push(current);
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParantheses_20 parentheses = new ValidParantheses_20();
        System.out.println(parentheses.isValid(new String("()[]{}")));
        System.out.println(parentheses.isValid(new String("()[]{}}")));
        System.out.println(parentheses.isValid(new String(")[]{}")));
    }
}
