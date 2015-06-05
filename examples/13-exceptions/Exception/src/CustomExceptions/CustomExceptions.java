package CustomExceptions;

import java.math.BigDecimal;

public class CustomExceptions {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount("Bill Gates", new BigDecimal(100));
		
		try {
			
			BigDecimal money = new BigDecimal(200);
			myAccount.withdraw(money);
			
			System.out.println("Successful transaction.");
			
		} catch (WithdrawException e) {
			System.out.println("An error has occurred during the transaction!");
		} finally {
			System.out.println("Operation is completed.");
		}
	}

}
