package com.my.util;

import java.util.List;
import static com.my.util.ArrayUtil.dealArray;

public class ListUtil {

    public static List<String[]> addList(List<String[]> list, String[] c, String[] ss) {
        list.add(c);
        list.add(c);
        if (ss != null) {
            for (int i = 0; i < ss.length; i++) {
                int n = 3;
                if (i == 5||i == 7) {
                    n = 4;
                }
                c  = new String[n];
                for (int j = 0; j < n; j++) {
                    char c1 = ss[i].charAt(j);
                    c[j] = c1+"";
                }
                list.add(c);
            }
        }
        return list;
    }

    public static List<String[]> filterList(List<String[]> list, List<String[]> tList, Integer array[]) {
        if (array == null) {
            return tList;
        }
        for (Integer a : array) {
            if (a == null) {
                continue;
            }
            if (a < 10&&a > 1) {
                String[] s = list.get(a);
                tList.add(s);
            } else if (a > 9&&a < 100){
                int a1 = a/10;
                int a2 = a%10;
                if (a1 > 1) {
                    String[] s = list.get(a1);
                    tList.add(s);
                }
                if (a2 > 1) {
                    String[] s = list.get(a2);
                    tList.add(s);
                }
            } else {
                System.out.println("param："+a+",out of range");
            }
        }
        return tList;
    }

    public static void dealList(List<String[]> list) {
        int size = list.size();
        if (list == null||size == 0) {
            System.out.println("no result");
            return;
        }
        if (size > 2) {
            String[] s1 = list.get(size - 2);
            String[] s2 = list.get(size - 1);
            String[] s = dealArray(s1, s2);
            if (s == null) {
                return;
            }
            String[] s3 = null;
            Integer count = 3;
            Integer leftSize = size -count;
            while (leftSize >= 0) {
                s3 = list.get(leftSize);
                s = dealArray(s3, s);
                if (s == null) {
                    return;
                }
                count++;
                leftSize = size -count;
            }
            for (String str : s) {
                System.out.println(str);
            }
            System.out.println("=========="+s.length+"==========");
        } else if (size == 2) {
            String[] s1 = list.get(size - 2);
            String[] s2 = list.get(size - 1);
            for (int i = 0; i < s1.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    System.out.println(s1[i]+""+s2[j]);
                }
            }
        } else if (size == 1) {
            String[] s1 = list.get(size - 1);
            for (int i = 0; i < s1.length; i++) {
                System.out.println(s1[i]+"");
            }
        }
    }
}
