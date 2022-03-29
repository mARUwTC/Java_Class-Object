public class ATM
{
	public static void main(String[] args)
	{
		// Print out the no. of account being created		
		Bank.printTotalNumAcc();
		System.out.println();		

		// Setup an account for scottie and deposit $1000		
		Bank scottie = new Bank("Scottie", 1000);
		// Setup an account for kent and deposit $100000		
		Bank kent = new Bank("Kent", 100000);
		
		// Print out scottie account balance to command prompt
		scottie.printBalance();
		// Print out kent account balance to command prompt
		kent.printBalance();
		System.out.println();

		// Print out the no. of account being created		
		Bank.printTotalNumAcc();
		System.out.println();

		// Deposit $200 into scottie bank account
		scottie.adjustBalance(200);
		// Withdraw $1000 from kent bank account
		kent.adjustBalance(-1000);
		System.out.println();

		// kent transfers $10000 to scottie account
		kent.transferTo(10000, scottie);
		System.out.println();
	}
}

