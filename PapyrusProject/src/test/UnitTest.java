package test;

import org.junit.Assert;
import org.junit.Test;

import Assignment6.combikeshopclient.impl.CustomerImpl;

public class UnitTest {

	@Test
	public void test() {
		System.out.println("Testing Client Server");
		CustomerImpl customer = new CustomerImpl();
		customer.setCustomerId(123456L);
		customer.setCustomerName("Rajesh Rajchal");
		System.out.println(customer);  // Calling toString
		Assert.assertTrue(!customer.getCustomerName().isEmpty());
		Assert.assertEquals(customer.getCustomerName(), "Rajesh Rajchal");
		Assert.assertEquals(customer.getCustomerId(), 123456);
	}
}
