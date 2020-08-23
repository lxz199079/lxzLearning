package com.my.util;

public class ArrayUtil {

    public static String[] dealArray(String[] s1, String[] s2) {
        if (s1 == null||s2 == null) {
            return null;
        }
        StringBuffer buffer = new StringBuffer("");
        String[] s = null;
        int length1 = s1.length;
        int length2 = s2.length;
        int length = length1*length2;
        int k = 0;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (k < length-1) {
                    buffer.append(s1[i]+""+s2[j]+",");
                } else {
                    buffer.append(s1[i]+""+s2[j]);
                }
                k++;
            }
        }
        String str = buffer.toString();
        if (str.contains(",")) {
            s = str.split(",");
        }
        return s;
    }
}
