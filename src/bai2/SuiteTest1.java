package bai2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SuiteTest1 {
	public String message = "Fpoly";
	JUnitMessage junitmessage = new JUnitMessage(message);
	@Test
	public void tetsJunitMessage() {
		System.out.println("Junit Message is printing");
		junitmessage.printMessage();
		
	}
	@Test
	public void testJUnitHiMessage() {
		message ="Hi" + message;
		System.out.println("JUnit Hi Message is");
		assertEquals(message, junitmessage.printHiMessage());
		System.out.println("Suite Test 2 is successful"+ message);
		
	}
}
