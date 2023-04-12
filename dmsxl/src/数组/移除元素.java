package 数组;

public class 移除元素 {
    public static void main(String[] args) {
        
    }

    /**
     * 方法一：暴力循环
     */
//    class Solution {
//        public int removeElement(int[] nums, int val) {
//            int count = 0;
//            int length = nums.length;
//            for (int i = 0; i < length; i++) {
//                if (nums[i] == val) {
//                    count++;
//                    for (int j = i; j < length-1 ; j++) {
//                        nums[j] = nums[j+1];
//                    }
//                    i--;
//                    length--;
//                }
//            }
//            return length;
//        }
//    }

    /**
     * 方法二：双指针
     */
    class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0;
            for (int fast = 0; fast < nums.length; fast++) {
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow++;
                }
            }
            return slow;
        }
    }
}

