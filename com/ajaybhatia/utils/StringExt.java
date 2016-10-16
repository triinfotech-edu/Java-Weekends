package com.ajaybhatia.utils;

public class StringExt {
	private static char toUpperCase(char c) {
		if (c >= 97 && c <= 123)
			return (char)(c - 32);

		return c;
	}

	private static char toggleCase(char c) {
		if (c >= 97 && c <= 123)
			return (char)(c - 32);
		else if (c >= 65 && c <= 91)
			return (char)(c + 32);

		return c;
	}


	public String upperCaseCharEachWord(String str) {
		char[] charr = str.toCharArray();
		
		for(int i = 0; i < charr.length; i++) {
			int j = i;
			if (i == 0 || charr[--j] == ' ')
				charr[i] = toUpperCase(charr[i]);
		}

		return new String(charr);
	}

	public String upperCaseAlternateChar(String str) {
		char[] charStr = str.toCharArray();

		for (int i = 0; i < charStr.length; i++) {
			if (i % 2 != 0)
				charStr[i] = toUpperCase(charStr[i]);
		}

		return new String(charStr);
	}

	public String toggleCase(String str) {
		char[] charStr = str.toCharArray();

		for (int i = 0; i < charStr.length; i++)
			charStr[i] = toggleCase(charStr[i]);

		return new String(charStr);
	}
}