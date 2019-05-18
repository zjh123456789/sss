package pers.zjh.leetcode.array;

/**
 * 包含最多水的容器     Container With Most Water
 * difficulty: Medium
 *
 * @author jinghui.zhu@luckincoffee.com
 * @date 2019/5/18 16:07
 */
public class LeetCode11 {

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(array);

        System.out.println("包含最大水的容量为: " + maxArea);
    }

    public static int maxArea(int[] height){
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max((right - left) * (Math.min(height[left], height[right])), maxArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
