package pers.zjh.algorithm;

public class bubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        System.out.println("原始数组ddddddddddddddddddddddddddddddddddd: " );
        print(arr);
        System.out.println("开启冒泡模式:小数渐渐浮出水面: ");
        bubble(arr);
    }

    public static void bubble(int[] array){
        for (int i=1; i<array.length; i++){
            for (int j=0; j<array.length-i; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println("第"+i+"趟冒泡结果为:");
            print(array);
        }
    }

    // 输出数组
    public static void print(int[] array){
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
