package 数组;

import java.util.Arrays;

public class 有序数组的平方 {
    public static void main(String[] args) {

    }

    /**
     * 方法一：暴力算法
     */
//    int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int) Math.pow(nums[i],2);
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    /**
     * 方法二：
     */
    int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];
        int j = 0;
        int k = nums.length - 1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[j]*nums[j] > nums[k]*nums[k] ) {
                ints[i] = nums[j] * nums[j];
                j++;
            }else {
                ints[i] = nums[k] * nums[k];
                k--;
            }
        }
        return ints;
    }
}
