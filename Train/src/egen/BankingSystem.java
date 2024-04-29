package egen;

public class BankingSystem {

	public static void main(String[] args) {
		String[][] queries = { { "CreateAccount", "1", "actId1" }, { "CreateAccount", "2", "actId1" },
				{ "CreateAccount", "3", "actId2" }, { "Deposit", "4", "non-existing", "2700" },
				{ "Deposit", "5", "actId1", "2700" }, { "Pay", "6", "non-existing", "2700" },
				{ "Pay", "7", "actId1", "2701" }, { "Pay", "8", "actId1", "200" } };
		
		
		
		
	}

}
