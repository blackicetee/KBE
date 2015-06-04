
public interface Account {
	String getAccountName();
	void setAccountName(String name);
	double getAccountCredit();
	void addAccountCredit(double credit);
	boolean checkCreditWorthy();
}
