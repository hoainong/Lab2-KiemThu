package bai2;

public class JUnitMessage {
	
	String message;
	
	public JUnitMessage(String messageString) {
		message = messageString;
	}
	
	public String printMessage() {
		return	message;
	}
	public String printHiMessage() {
		String a = "Hi"+ message;
		return	a;
	}
}
