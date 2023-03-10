package com.bai1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
 public static void main(String[] args) {
	JUnitCore runner = new JUnitCore();
	Result result = runner.run(MathFuncTest.class);
	System.out.println("run test: " + result.getRunCount());
	System.out.println("failed test: " + result.getFailureCount());
	System.out.println("ignored tests: " + result.getIgnoreCount());
	System.out.println("success: "+result.wasSuccessful());
}
}
