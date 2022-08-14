package Nowcoder2019Basic.class01;


import java.util.Arrays;
/*
    选择排序
 */
public class Code01_SeclectionSort {
    public static void selectionSort(int[] arr) {
        if (arr == null ||arr.length < 2)
            return;

        for (int i = 0; i < arr.length - 1; i++) {  // scan the whole array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] argv) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}