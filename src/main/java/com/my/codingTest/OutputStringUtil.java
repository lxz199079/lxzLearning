package com.my.codingTest;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static com.my.util.ListUtil.addList;
import static com.my.util.ListUtil.dealList;
import static com.my.util.ListUtil.filterList;

public class OutputStringUtil {

    @Test
    public void dealDigits() {
        Integer num = 8;
        Integer[] array = new Integer[num];
        array[0] = 22;
        array[1] = 33;
        array[2] = 44;
        array[3] = 55;
        array[4] = 66;
        array[5] = 77;
        array[6] = 88;
        /*array[7] = 92;
        array[8] = 95;
        array[9] = 98;*/
        dealChar(array);
    }

    public void dealChar(Integer array[]) {
        String s = "abc#def#ghi#jkl#mno#pqrs#tuv#wxyz";
        String[] ss = null;
        if (s != null&&s != "") {
            ss = s.split("#");
        }
        String[] c  = new String[3];
        List<String[]> list = new ArrayList<String[]>(16);
        list = addList(list, c, ss);
        List<String[]> tList = new ArrayList<String[]>(32);
        tList = filterList(list, tList, array);
        dealList(tList);
    }

}