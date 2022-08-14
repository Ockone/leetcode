package Nowcoder2019Basic.class01;

import java.util.Arrays;

/*
    插入 排序
 */
public class Code03_InsertionSort {

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr, j, j+1);
            }
        }
    }

    // swap arr[i] and arr[j]
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void main(String[] argv) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
