import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		double totalbalance = 0;
		for(BankAccount acc: accounts){
            totalbalance += acc.getBalance();
        }
		return totalbalance;
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		int accountbalance = 0;
		for (BankAccount acc: accounts){
			if(acc.getBalance() >= atLeast){
				accountbalance ++;
			}

		}
		return accountbalance;
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		for(BankAccount acc: accounts){
			if(acc.getAccountNumber() == accountNumber){
				return acc;
			}
		}
		return null;
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){
		if (accounts.isEmpty()){
			return null;
		}
		BankAccount AccountMax = accounts.get(0);
		for (BankAccount acc: accounts){
			if (acc.getBalance() >= AccountMax.getBalance()){
				AccountMax = acc;
			}
		}
		return AccountMax;
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		if (accounts.isEmpty()){
			return null;
		}
		BankAccount AccountMax = accounts.get(0);
		for (BankAccount acc: accounts){
			if (acc.getBalance() <= AccountMax.getBalance()){
				AccountMax = acc;
			}
		}
		return AccountMax;
	}
}