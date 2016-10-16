class StringToCharArray {
	public static void main(String[] args) {
		String string = "this is a string";
		// String to char array conversion
		char[] charArray = string.toCharArray();
		// Display char array
		for (int i = 0; i < charArray.length; i++)
			System.out.println(charArray[i]);

		char[] charArray1 = {'a', ' ', 'b', 'e', 'a', 'u', 't', 'i', 'f', 'u', 'l', ' ', 'd', 'a', 'y'};
		// char array to String conversation
		String string2 = new String(charArray1);

		System.out.println(string2); 
	}
}