package Nowcoder2019Basic.class01;


/*
    寻找奇数频次数字问题
 */
public class Code07_evenTimesOddTimes {

    /*
        找到数组中出现奇数次的唯一的那个数
     */
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int cur :arr) {
            eor ^= cur;
        }
        System.out.println(eor);
    }

    /*
        找到数组中出现奇数次的唯二的那两个数
    */
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int j : arr) {
            eor ^= j;
        }   // eor = a ^ b
        // a与b不同，则eor必有一位为1
        int rightOne = eor & (~eor + 1);    // NOTE 这是常用的取最右侧1二进制序列的方法
        // 一个数与上自己的取反加一，就是得到自己最右非零位的序列

        int onlyOne = 0;    //eor'
        for (int cur : arr) {
            if ((cur & rightOne) != 0) {
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));

    }

    public static void main(String[] argv) {
        int[] arr1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        printOddTimesNum1(arr1);
        int[] arr2 = {1, 2, 3, 4, 6, 1, 2, 3, 4, 5};
        printOddTimesNum2(arr2);
    }
}
