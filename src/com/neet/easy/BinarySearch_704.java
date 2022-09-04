package com.neet.easy;
/*
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * */

public class BinarySearch_704 {

    /* Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
    Memory Usage: 55.2 MB, less than 5.30% of Java online submissions for Binary Search.
*/
    public int search(int[] nums, int target) {
        //divide nums in half, and compare target

        int left = 0, right = nums.length - 1, mid = (left + right) / 2;
        while (left < right) {
            if (nums[mid] >= target) {
                right = mid;
            } else if (nums[mid + 1] <= target) {
                left = mid + 1;
            } else {
                break;
            }
            mid = (left + right) / 2;
        }

        if (nums[left] == target) {
            return left;
        } else if (nums[right] == target) {
            return right;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        BinarySearch_704 search = new BinarySearch_704();
        System.out.println(search.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
