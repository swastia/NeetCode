package com.neet.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
// This method is 77.77% better than all submissions on leetcode.

    /* Notice, not entire array is stored in the hashmap first, we traverse through the list,
    and find the complement number for the first position.
     If number already exists in the map, return the indices of complement and current values
     else, add current number and it's index to the map and continue on.
     This way we do not need to store entire array in the map, if complement is found at initial positions, then space is saved
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;

    }

    public static void main(String[] args) {
        TwoSum_1 twoSum = new TwoSum_1();
        Arrays.stream(twoSum.twoSum(new int[] {2,7,11,15}, 9)).forEach(System.out::println);
    }
}
