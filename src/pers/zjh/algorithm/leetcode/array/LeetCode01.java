package pers.zjh.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和     Two Sum
 * difficulty: Easy
 *
 * @author jinghui.zhu
 * @date 2019/3/11 16:15
 */
public class LeetCode01 {

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        int[] test = twoSum(a, target);
        for (int i=0; i<test.length; i++){
            System.out.println(test[i]);
        }
    }

    /**
     * 找到数组中两数相加的和等于 sum 的两个数的下标
     *
     * @param nums 给出的数组
     * @param target 给定目标总和
     */
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        if (nums == null || nums.length == 0){
            return result;
        }
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (target == (nums[i] + nums[j])){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * 快速解法
     *
     * @param nums 给出数组
     * @param target 目标和
     * @return 两数下标
     */
    public static int[] leetcode(int[] nums, int target){
        Map<Integer, Integer> others = new HashMap<Integer, Integer>(nums.length);
        for (int i=0; i<nums.length; i++){
            if (others.containsKey(target - nums[i])){
                return new int[]{ others.get(target - nums[i]), i};
            }
            others.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such solution");
    }
}
