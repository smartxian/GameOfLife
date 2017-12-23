package cn.xianxian;

import org.junit.Test;

/**
 * @author xianxian
 * @date 2017-12-23 13:47:51
 */
public class InitTest {
    @Test
    public void initDataByFile() throws Exception {
        int [][] array = new Init().initDataByFile();
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}