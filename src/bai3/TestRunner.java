package bai3;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitAnnotationsExample.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("Result==" + result.wasSuccessful());
	}
}
