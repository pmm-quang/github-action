package com.example.testaction.badstyle;

// Intentional bad style for Checkstyle demo
public class badstyle {

	private int BadField = 0;
	private int bad_field = 1;

	public void BadMethod(int BadParam) {
		int bad_local_var = 0;
		if (BadField > 0) BadField++;
		try {
			Integer.parseInt("abc");
		} catch (NumberFormatException ex) {
		}
		String veryLongString = "This is an intentionally very long line that exceeds 120 characters to trigger Checkstyle LineLength rule and verify the CI pipeline fails as expected when style violations are present";
	}

	public void methodWithTab() {	int x = 1; }
}
