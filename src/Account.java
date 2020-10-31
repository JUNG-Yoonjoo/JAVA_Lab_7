import java.util.ArrayList;

public class Account{

  private int balance;

  public Account(int initialBalance) {
    balance = initialBalance;
  }

  public void processCheck(Check check) throws NotEnoughFundException {
	  
	  NotEnoughFundException problem = new NotEnoughFundException();
	  
	  if (balance < check.getAmt())
		  throw problem;
	  else
		  balance = balance - check.getAmt();
  }

  public void processTransaction(ArrayList<Check> checks) {
	  System.out.println("The current balance is " + balance);
	  System.out.println("");
	  
	  int i = 0;
	  final int length = checks.size();
	  while(i < length) {
		  System.out.println("Processing Check No: " + checks.get(i).getNum() + ", Payee: " + checks.get(i).getName() + ", Amount: " + checks.get(i).getAmt());
		  try {
			  processCheck(checks.get(i));
			  System.out.println("The current balance is " + balance);
			  System.out.println("");
			  i++;
		  }catch(NotEnoughFundException e) {
			  System.out.println("check cannot be cleared due to not enough fund.");
			  System.out.println("add 500 to the account...");
			  balance = balance + 500;
			  System.out.println("The current balance is " + balance);
			  System.out.println("");
		  }
	  }
	  

	  
	  /*for(int i = 0; i < checks.size(); i++) {
		  System.out.println("Processing Check No: " + checks.get(i).getNum() + ", Payee: " + checks.get(i).getName() + ", Amount: " + checks.get(i).getAmt());
		  try {
			  processCheck(checks.get(i));
			  System.out.println("The current balance is " + balance);
			  System.out.println("");
		  }catch(NotEnoughFundException e) {
			  System.out.println("check cannot be cleared due to not enough fund.");
			  System.out.println("add 500 to the account...");
			  balance = balance + 500;
			  System.out.println("The current balance is " + balance);
			  System.out.println("");
		  }
	  }*/
  }
}
