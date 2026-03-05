package com.example.testaction;

/**
 * Service đơn giản dùng để test luồng CI (compile, checkstyle, test).
 */
public class CalculatorService {

    /**
     * Cộng hai số nguyên.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Trừ hai số nguyên.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Kiểm tra số chẵn.
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

}
