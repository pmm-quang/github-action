package com.example.testaction.util;

/**
 * Tiện ích xử lý chuỗi.
 */
public final class StringUtils {

    private StringUtils() {
    }

    /**
     * Kiểm tra chuỗi rỗng hoặc null.
     */
    public static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    /**
     * Cắt chuỗi về độ dài tối đa.
     */
    public static String truncate(String value, int maxLength) {
        if (value == null) {
            return null;
        }
        if (value.length() <= maxLength) {
            return value;
        }
        return value.substring(0, maxLength);
    }

}
