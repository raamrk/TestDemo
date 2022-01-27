package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BackgroundHook {
	
	@Before
	public void before() {
		System.out.println("Runs before all scenarios");
	}
	
	@After
	public void after() {
		System.out.println("Runs after all scenarios");
	}
}
