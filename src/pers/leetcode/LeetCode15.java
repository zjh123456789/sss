package pers.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * 难易程度: Medium
 *
 * @author admin
 * @date 2019/5/11 9:18
 */
public class LeetCode15 {

    public static void main(String[] args) {
        int[] array = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};
        System.out.println("result: " + doublePointer(array));
    }

    /**
     * 暴力解法 3层循环 超时了...
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++){
            int current = nums[i];
            int twoSum = 0 - current;
            for (int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k < nums.length; k++){
                    if (nums[j] + nums[k] == twoSum){
                        List<Integer> integers = new ArrayList<>();
                        integers.add(current);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        boolean flag = true;
                        for (List<Integer> list : result){
                            if (list.containsAll(integers) && integers.containsAll(list)){
                                flag = false;
                            }
                        }
                        if (flag){
                            result.add(integers);
                        }
                    }
                }
            }
        }

        return result;
    }

    /**
     * 双重指针移动
     * @param nums
     * @return
     */
    public static List<List<Integer>> doublePointer(int[] nums){
        if (null == nums){
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++){
            // 重复元素直接跳过
            if (i >= 1 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                if (nums[i] + nums[j] + nums[k] == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // 跳过重复元素，j 从前往后，所以与 j - 1 比较
                    while (j < k && nums[j] == nums[j - 1]){
                        j++;
                    }
                    // 跳过重复元素，k 从后往前，所以与 k + 1 比较
                    while (j < k && nums[k] == nums[k + 1]){
                        k--;
                    }
                }else if (nums[i] + nums[j] + nums[k] > 0){
                    k--;
                }else {
                    j++;
                }
            }
        }
        return result;
    }

}
