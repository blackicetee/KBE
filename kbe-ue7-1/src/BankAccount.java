import java.io.Serializable;

@CreationInfo(author = "Thilo", description = "This class represents an bank account", tags = {"Bank", "Accounts", "Credits"}, baseclass = AccountImpl.class, interfaces = {Credit.class, Serializable.class})
public class BankAccount extends AccountImpl implements Credit, Serializable{
	
	public BankAccount(String accountName, double accountCredit) {
		super(accountName, accountCredit);
	}

	String kindOfCredit = "";
	double loanRate = 0;
	

	@Override
	public String getKindsOfCredit() {
		return kindOfCredit;
	}

	@Override
	public void setKindOfCredit(String kindsOfCredit) {
		this.kindOfCredit = kindsOfCredit;
		
	}

	@Override
	public double getloanRate() {
		return loanRate;
	}

	@Override
	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}

}
