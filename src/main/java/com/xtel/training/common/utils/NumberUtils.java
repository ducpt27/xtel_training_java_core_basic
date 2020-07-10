package com.xtel.training.common.utils;

public class NumberUtils {

    public static Integer parseInt(String s) {
        if (s == null) return null;
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Không thể chuyển thành số!");
        }
        return null;
    }

    public static Double parseDouble(String s) {
        if (s == null) return null;
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            System.out.println("Không thể chuyển thành số!");
        }
        return null;
    }

    public static boolean compare(Number n1, Number n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        if (n1.equals(n2)) {
            return true;
        }
        return false;
    }
}