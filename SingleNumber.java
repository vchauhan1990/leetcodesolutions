/*
Single Number


Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

 */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        int xor = 0;
        for(final int num: nums) {
            xor^=num;
        }
        return xor;
    }

    public static int singleNumber1(int[] nums) {
        if(nums.length==1) {
            return nums[0];
        }
        final Map<Integer, Integer> map = new HashMap<>();
        for(final int num: nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber1(new int[]{4,1,2,1,2}));
    }

}
