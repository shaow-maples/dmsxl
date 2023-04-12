package 数组;

public class 长度最小的子数组 {
    public static void main(String[] args) {

    }
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int result = 0;
            int sum = 0;
            int sumLength = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = 0;
                for (int j = i; j < nums.length; j++) {
                    sum+=nums[j];
                    if (sum >= target) {
                        sumLength = j-i+1;
                    }
                }
            }
        }
    }
}
