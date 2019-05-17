package pers.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4Sum 四数之和
 * 难易程度：Medium
 *
 * @author jinghui.zhu
 * @date 2019/5/17 9:31
 */
public class LeetCode18 {

    public static void main(String[] args) {
        int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
        int target = 0;
        System.out.println("leetcode18：" + fourSum(nums, target));
    }


    public static List<List<Integer>> fourSum(int[] nums, int target){
        //原始数组排序
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++){
            // 去重
            if (i >= 1 && nums[i] == nums[i-1]){
                continue;
            }

            int threeSum = target - nums[i];

            for (int j = i + 1; j < nums.length - 2; j++){
                //去重
                if (j-1 != i && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j + 1;
                int z = nums.length - 1;

                while (k < z){
                    if (nums[j] + nums[k] + nums[z] > threeSum){
                        z--;
                    }else if (nums[j] + nums[k] + nums[z] < threeSum){
                        k++;
                    }else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[z]);
                        result.add(temp);
                        z--;
                        k++;
                        //去重
                        while (nums[k] == nums[k-1] && k < nums.length - 1){
                            k++;
                        }
                        //去重
                        while (nums[z] == nums[z+1] && z > 0){
                            z--;
                        }
                    }
                }

            }
        }
        return result;
    }
}
