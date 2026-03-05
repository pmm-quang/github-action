package com.example.testaction.badstyle;

/**
 * Helper class with intentional style violations for Checkstyle demo.
 */
public class BadStyleHelper {

	private int _counter = 0;
	private String Bad_Name = "test";

	public void ProcessData(int InputParam) {
		int result_value = 0;
		for (int i = 0; i < 5; i++) result_value += i;
		while (result_value > 0) result_value--;
		try {
			Integer.parseInt("x");
		} catch (NumberFormatException e) {
		}
		String veryLongLine = "Another intentionally long line exceeding 120 characters to trigger Checkstyle LineLength rule and verify the CI pipeline correctly reports style violations in multiple files";
	}

	public int GetBadValue() {
		return _counter;
	}

}
