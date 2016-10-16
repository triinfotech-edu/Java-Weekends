package com.ajaybhatia.numbers;

public class Number {
	private float num;

	// Default constructor
	public Number() {
		num = 0.0f;
	} 

	// Parameterized constructor
	public Number(float num) {
		this.num = num;
	}

	// Setter or mutator
	public void setNum(float num) {
		this.num = num;
	}

	// Getter or accessor
	public float getNum() {
		return num;
	}

	public String toString() {
		return String.valueOf(num);
	}

	public boolean isEven() {
		return num % 2 == 0;
	}

	public boolean isPrime() {
		for (int i = 2; i <= Math.sqrt(num); i++) // Eucledian Principle
			if (num % i == 0)
				return false;

		return true;
	}

	public Number add(Number n) {
		return new Number(num + n.num);
	}

	public Number product(Number n) {
		return new Number(num * n.num);
	}

	public Number divide(Number n) {
		return new Number(num / n.num);
	}

	public Number subtract(Number n) {
		return new Number(num - n.num);
	}
}