package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitTest
{

	@BeforeClass
	public static void beforeClass() throws Exception
	{
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() throws Exception
	{
		System.out.println("After class");
	}

	@Before
	public void before() throws Exception
	{
		System.out.println("\tBefore test");
	}

	@After
	public void after() throws Exception
	{
		System.out.println("\tAfter test");
	}

	@Test
	public void test_01()
	{
		System.out.println("\t\tTest # 01");
	}
	public void test_02()
	{
		System.out.println("\t\tTest # 02");
	}
	public void test_03()
	{
		System.out.println("\t\tTest # 03");
	}
	public void test_04()
	{
		System.out.println("\t\tTest # 04");
	}

}
