package org.demoexcel;

import org.testng.annotations.Test;

public class TestNGAssert2 {
	@Test
	private void tc0()
	{
		System.out.println("Method 11");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc1()
	{
		System.out.println("Method 12");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc2()
	{
		System.out.println("Method 13");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc3()
	{
		System.out.println("method 14");
		System.out.println(Thread.currentThread().getId());
	}
	
}
