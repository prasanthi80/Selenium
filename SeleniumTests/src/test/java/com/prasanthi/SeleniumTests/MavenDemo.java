package com.prasanthi.SeleniumTests;

import org.testng.annotations.Test;

public class MavenDemo {
	@Test(priority=2)
	public void Test1()
	{
		System.out.println("from Test1");
	}
    @Test(priority=1) 
	public void Test2()
	{
		System.out.println("from test2");
	}
    @Test(priority=3)
    public void Test3()
    {
    	System.out.println("from Test3");
    }
    @Test
    public void Test4()
	{
		System.out.println("from Test4");
	}
    @Test(priority=4) 
	public void Test5()
	{
		System.out.println("from test5");
	}
    @Test(priority=5)
    public void Test6()
    {
    	System.out.println("from Test6");
    }
    @Test
    public void Test7()
	{
		System.out.println("from test7");
	}
   @Test
    public void Test8()
    {
    	System.out.println("from Test8");
    }
}
