package cn.xianxian.utils;

/**
 * @author xianxian
 * @date 2017-12-23 14:04:27
 */
public class PrintUtils {

    public static void printOriginArray(int[][] autoArray) {
        for (int i = 1; i < autoArray.length - 1; i++) {
            for (int j = 1; j < autoArray[i].length - 1; j++) {
                System.out.print(autoArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTwoArray(int [][] array) {
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}