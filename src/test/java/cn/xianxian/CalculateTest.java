package cn.xianxian;

import cn.xianxian.utils.PrintUtils;
import org.junit.Test;

/**
 * @author xianxian
 * @date 2017-12-23 14:16:24
 */
public class CalculateTest {
    @Test
    public void calculate() throws Exception {
        int [][] newArray = new Calculate().calculate(new Init().init());
        PrintUtils.printOriginArray(newArray);

    }

}