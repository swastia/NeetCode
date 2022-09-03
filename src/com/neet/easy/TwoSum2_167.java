package com.neet.easy;

import java.util.Arrays;
/*
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * */
public class TwoSum2_167 {
    /*Runtime: 2 ms, faster than 80.42% of Java online submissions for Two Sum II - Input Array Is Sorted.
Memory Usage: 50.7 MB, less than 9.30% of Java online submissions for Two Sum II - Input Array Is Sorted.
*/
    public int[] twoSum(int[] numbers, int target) {
        // create two pointers from start and end

        int start = 0;
        int end = numbers.length-1;
        int[] result = new int[2];

        while(start<end){
            if(numbers[start] + numbers[end] == target){
                result[0] = start +1;
                result[1] = end+1;
                break;
            }
            if(numbers[end] > target){
                end--;
            }
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            if(numbers[start] + numbers[end] < target){
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum2_167 twoSum = new TwoSum2_167();
        Arrays.stream(twoSum.twoSum(new int[]{2,7,11,15} , 9)).forEach(System.out::println);
        Arrays.stream(twoSum.twoSum(new int[]{5,25,75} , 100)).forEach(System.out::println);
    }
}
