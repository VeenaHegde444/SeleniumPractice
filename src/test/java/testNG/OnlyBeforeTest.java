package testNG;
/*
 * Can we run only @Test methods without @Before & @After methods?
 * Ans: Yes, we can run.
 * 
 */
import org.testng.annotations.Test;

public class OnlyBeforeTest {
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

}
