package cn.xianxian.utils;

/**
 * @author xianxian
 * @date 2017-12-23 14:04:27
 */
public class PrintUtils {
    public static void printTwoArray(int [][] array) {
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}