package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int s=Integer.parseInt(str);
        return s > 0;
    }
}
