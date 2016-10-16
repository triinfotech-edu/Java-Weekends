package com.ajaybhatia.numbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Number n1 = new Number(10f);
		Number n2 = new Number(20f);

		Number n3 = n1.product(n2);

		System.out.println(n3);
	}
}