package pers.leetcode;

/**
 * 求两个数组的中位数
 *
 * @author admin
 * @date 2019/3/14 9:25
 */
public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("中位数 : " + findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        double median;
        int lengthSum = nums1.length + nums2.length;
        int[] nums3 = new int[lengthSum];
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] <= nums2[j]){
                nums3[i+j] = nums1[i++];
            }else {
                nums3[i+j] = nums2[j++];
            }
        }
        if (i == nums1.length){
            for (int count = j; count < nums2.length; count++){
                nums3[i+count] = nums2[count];
            }
        }
        if (j == nums2.length){
            for (int count = i; count < nums1.length; count++){
                nums3[j+count] = nums1[count];
            }
        }
        if (lengthSum % 2 == 0){
            double sum = nums3[lengthSum/2 - 1] + nums3[lengthSum/2];
            median = sum/2;
        }else {
            median = nums3[lengthSum/2];
        }
        return median;
    }
}
