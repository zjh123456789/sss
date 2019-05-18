package pers.zjh.leetcode.array;

import java.util.Arrays;

/**
 * 最接近的三数之和     3Sum Closest
 * difficulty: Medium
 *
 * @author jinghui.zhu
 * @date 2019/5/11 9:18
 */
public class LeetCode16 {

    public static void main(String[] args) {
        int[] arrays = {1, 1, -1, -1, 3};
        int result = threeSumClosest(arrays, -1);
        System.out.println("LeetCode16 答案: " + result);
    }

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result = 10086;
        int d_value = 10086;

        for (int i = 0; i < nums.length - 2; i++){
            // 去重
            if (i >= 1 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k){
                int sum;
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < d_value){
                    d_value = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target){
                    // 减小当前三数总和，尽量接近目标值
                    k--;
                }else {
                    // 增大当前三数之和，尽量接近目标值
                    j++;
                }
            }
        }
        return result;
    }
}
