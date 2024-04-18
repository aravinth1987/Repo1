package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	//Before -> Background - > scenario -> After
	@Before("@NetBanking")
	public void netBankingUser() {
		System.out.println("*******************************************");
		System.out.println("set up entries for net banking user");
	}

	@Before("@Mortgage")
	public void mortgageUser() {
		System.out.println("set up entries for mortgage user");
		System.out.println("*******************************************");
	}
	
	@After
	public void teardown() {
		System.out.println("Clear out all entries");
	}
}
