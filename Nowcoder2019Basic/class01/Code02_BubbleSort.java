package Nowcoder2019Basic.class01;

import java.util.Arrays;
/*
    冒泡排序
 */
public class Code02_BubbleSort {

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;
        for (int j = arr.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1])
                    swap(arr, i, i+1);
            }
        }
    }

    // swap arr[i] and arr[j]
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        /*
        这是一种抖机灵的写法，不建议这么写

        异或两种理解：1）相同为0，不同为；2）不进位相加
        关于异或运算 ^ :
        0 ^ N = N;
        N ^ N = 0;
        且异或运算满足交换律和结合律

        假设有 a=甲, b=乙
        a = a^b = 甲^乙
        b = a^b = (甲^乙)^乙 = 甲^(乙^乙) = 甲^0 = 甲
        a = a^b = (甲^乙)^甲 = (甲^甲)^乙 = 0^乙 = 乙
        a与b的值交换成功

        a与b值可以一样，但是a和b不能指向同一内存区域，否则会被洗成0
        这种抖机灵方式实现了原地交换两个变量，不需要额外内存
        本来不推荐这样做，但是这个示例有利于理解异或操作
         */

    }
    public static void main(String[] argv) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
