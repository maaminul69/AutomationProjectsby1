package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNgDependencyDemo {

	@Test (dependsOnMethods = {"test3"})
	public void test1() {
		System.out.println(("I am in test 1"));
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println(("I am in test 2"));
	}
	
	@Test
	public void test3() {
		System.out.println(("I am in test 3"));
	}
}
