
public class AccountImpl implements Account{
	private String accountName = "";
	private double accountCredit = 0;
	public AccountImpl(String accountName, double accountCredit) {
		this.accountName = accountName;
		this.accountCredit = accountCredit;
	}
	
	@Override
	public String getAccountName() {
		return accountName;
	}

	@Override
	public void setAccountName(String name) {
		accountName = name;
		
	}

	@Override
	public double getAccountCredit() {
		return accountCredit;
	}

	@Override
	public void addAccountCredit(double credit) {
		accountCredit += credit;
	}

	@Override
	public boolean checkCreditWorthy() {
		if (accountCredit > 0) {
			return true;
		}
		else {
			return false;	
		}
	}
}
