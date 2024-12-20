/*

Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */


public class RotateArray {


    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }

    public static void reverse(int[] nums, int start, int end) {
        int mid = (start+end)/2;
        for(int i=start;i<mid;i++) {
            int temp = nums[i];
            nums[i] = nums[end-1-(i-start)];
            nums[end-1-(i-start)]=temp;
        }
    }

    public static void main(String[] args) {
        final int[] nums = new int[] {-1,-100,3,99,1,2,3,4,5,6,7};
        rotate(nums, 5);
        for(final int num: nums) {
            System.out.format("%d\t", num);
        }
    }

}
