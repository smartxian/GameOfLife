package cn.xianxian;

import cn.xianxian.utils.PrintUtils;
import org.junit.Test;

/**
 * @author xianxian
 * @date 2017-12-23 13:47:51
 */
public class InitTest {
    @Test
    public void initDataByFile() throws Exception {
        int [][] array = new Init().initDataByFile();
        PrintUtils.printTwoArray(array);
    }

    @Test
    public void autoArrayTest() throws Exception  {
        Init init = new Init();
        int [][] array = init.initDataByFile();
        int [][] newArray = init.autoArray(array);
        PrintUtils.printTwoArray(newArray);
    }
}