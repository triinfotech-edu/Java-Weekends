class InsufficientAmountException extends Exception {
	private int amount;

	InsufficientAmountException(int amount) {
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		return amount + " cannot be debited due to Insufficient balance";
	}
}

class AccountManagement {
	private static int balance;

	private static void deposit(int amount) {
		balance += amount;
	} 

	private static void witdraw(int amount) {
		balance -= amount;
	}

	public static int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		deposit(1000);
		deposit(200);
		System.out.println(getBalance());

		try {
			witdraw(500);
			witdraw(800);
			witdraw(100);
			if (getBalance() < 0)
				throw new InsufficientAmountException(800);
			
			System.out.println(getBalance());
		} catch (InsufficientAmountException e) {
			System.out.println(e.getMessage());
		}
	}
}