package cn.xianxian;

/**
 * @author xianxian
 * @date 2017-12-23 14:09:29
 */
public class Calculate {

    public int[][] calculate(int [][] array) {
        int [][] result = new int[array.length][array[0].length];
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                int sum = array[i-1][j-1] + array[i-1][j] +
                        array[i-1][j+1] + array[i][j-1]
                        + array[i][j+1] + array[i+1][j-1]
                        + array[i+1][j] + array[i+1][j+1];
                if (array[i][j] == 1) {
                    if (sum == 2 || sum == 3) {
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                } else {
                    if (sum == 3) {
                        result[i][j] = 1;
                    } else {
                        result[i][j] = 0;
                    }
                }
            }
        }

        return result;
    }

    public boolean isAllDeath(int [][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int i : ints) {
                sum += i;
            }
        }

        return sum == 0;
    }

}