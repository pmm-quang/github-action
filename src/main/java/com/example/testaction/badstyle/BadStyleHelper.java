package com.example.testaction.badstyle;

/**
 * Helper class with intentional style violations for Checkstyle demo.
 */
public class BadStyleHelper {

    private int counter = 0;
    private String badName = "test";

    public void processData(int inputParam) {
        int resultValue = 0;
        for (int i = 0; i < 5; i++) {
            resultValue += i;
        }
        while (resultValue > 0) {
            resultValue--;
        }
        try {
            Integer.parseInt("x");
        } catch (NumberFormatException e) {
            throw e;
        }
        String veryLongLine = "Another intentionally long line exceeding 120 characters " +
                "to trigger Checkstyle LineLength rule and verify the CI pipeline correctly " +
                "reports style violations in multiple files";
    }

    public int getBadValue() {
        return counter;
    }
}
