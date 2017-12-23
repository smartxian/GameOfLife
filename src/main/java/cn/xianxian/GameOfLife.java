package cn.xianxian;

import cn.xianxian.utils.PrintUtils;

/**
 * @author xianxian
 * @date 2017-12-23 14:23:24
 */
public class GameOfLife {
    public static void main(String[] args) throws Exception {
        int[][] autoArray = new Init().init();
        Calculate calculate = new Calculate();
        while (!calculate.isAllDeath(autoArray)) {
            PrintUtils.printOriginArray(autoArray);
            autoArray = calculate.calculate(autoArray);
            Thread.sleep(2000);
            System.out.println();
            System.out.println();
        }

        PrintUtils.printOriginArray(autoArray);
        System.out.println("∂ºÀ¿¡À°£°£°£°£");
    }

}