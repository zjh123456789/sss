//package pers.zjh;
//
///*
//   两个正序排序的数组，求合并后的第K个。两个数组内元素没有 0，找不到第 K 个数可以返回 0。
//
//   示例 1：
//   如果 K = 5
//   >array1 = [1, 13, 16, 20]
//   >array2 = [2, 8, 12, 27]
//   >则第K个数是：13
//
//   ====================================注意=========================================
//   ====================================注意=========================================
//   要求：
//   1、不要申请额外的空间，比如：数组、List、Set、Map；
//   2、不要使用java的sort相关函数，当然也不要自己手写冒泡排序或者其他排序，本题不是考察排序算法；
//   3、需要写单元测试，写在 Code1_Test 内;
//   4、穷举想到的测试边界case，而不仅仅是题目中示例的case；
//*/
//// 20:40
//public class Test {
//
//    public static void main(String[] args) {
//        int[] array1 = { 1, 13, 16, 20 };
//        int[] array2 = { 2, 8, 12, 27 };
//        int k = 5;
//        int result = findK(array1, array2, k);
//        System.out.println(result);
//    }
//
//    // 两个正序排序的数组，求合并后的第K个。两个数组内元素没有 0，找不到第 K 个数可以返回 0。
//    public static int findK(int[] array1, int[] array2, int k) {
//        // 边界条件 array1 为空
//        if (null == array1) {
//            return (null == array2 ? 0 : (array2.length >= k ? array2[k] : 0));
//        }
//
//        // 边界条件 array2 为空
//        if (null == array2) {
//            return (null == array1 ? 0 : (array1.length >= k ? array2[k] : 0));
//        }
//
//        int length1 = array1.length;
//        int length2 = array2.length;
//        // 都不为空，则校验两数组总长度是否少于 k
//
//        if (length1 + length2 < k) {
//            return 0;
//        }
//
//        // 应该用一个新的 flag 值来标记下标位置， flag ++, 递增遍历 array1 或者 array2 的值
//
//        //
//        for (int i : array1) {
//
//                while (array1[i] > array2[j]) {
//                    // 移位
//                    for (int q = length1 - 1; q > i; q--) {
//                        array1[q] = array1[q-1];
//                    }
//                    array1[i] = array2[j];
//                    break;
//                }
//            }
//        }
//        return array1[k];
//    }
//
//}
//
