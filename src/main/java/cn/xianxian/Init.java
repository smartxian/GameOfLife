package cn.xianxian;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xianxian
 * @date 2017-12-23 13:29:44
 */
public class Init {

    public int[][] init() throws IOException {
        return autoArray(initDataByFile());
    }

    private int[][] initDataByFile() throws IOException {
        List<String[]> temp = new ArrayList<String[]>();
        File f = new File("init.data");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        while (bf.ready()) {
            String line = bf.readLine();
            temp.add(line.split(" "));
        }
        int [][] result = new int[temp.size()][];
        for (int i = 0; i < temp.size(); i++) {
            int [] line = new int[temp.get(i).length];
            for (int j = 0; j < temp.get(i).length; j++) {
                line[j] = Integer.parseInt(temp.get(i)[j]);
            }
            result[i] = line;
        }
        return result;
    }

    private int[][] autoArray(int[][] originArray) {
        int[][] result = new int[originArray.length + 2][originArray[0].length + 2];
        for (int i = 0; i < originArray.length; i++) {
            for (int j = 0; j < originArray[i].length; j++) {
                result[i + 1][j + 1 ] = originArray[i][j];
            }
        }
        return result;
    }
}