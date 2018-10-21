package test;
import org.junit.Assert;
import org.junit.Test;

import demo.Calculator;
import exception.InvalidNumberException;
import exception.NegativeNumberException;
import exception.ZeroException;

public class TestClass {
	@Test
	public void testMethod1()
	{
		Calculator c = new Calculator();
		int res = c.addDigits(965);
		Assert.assertEquals(20, res);
	}
	
	@Test(expected = NegativeNumberException.class)
	public void testMethod2()
	{
		Calculator c = new Calculator();
		c.addDigits(-86);
	}
	
	@Test(expected = InvalidNumberException.class)
	public void testMethod3()
	{
		Calculator c = new Calculator();
		c.addDigits(4589);
	}
	
	@Test(expected = InvalidNumberException.class)
	public void testMethod4()
	{
		Calculator c = new Calculator();
		c.addDigits(85);
	}
	
	@Test(expected = ZeroException.class)
	public void testMethod5()
	{
		Calculator c = new Calculator();
		c.addDigits(0);
	}
}
