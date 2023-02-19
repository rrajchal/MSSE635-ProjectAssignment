package Assignment6.com.bikeshop.client.test;

import org.junit.jupiter.api.Assertions;

import Assignment6.com.bikeshop.client.Customer;

class CustomerTest {

	@org.junit.jupiter.api.Test
	void test() {
		Customer customer = new Customer();
		customer.setCustomerName("John");
		customer.setCustomerId(123456L);
		
		System.out.println(customer);
		
		Assertions.assertTrue(!customer.customerName.isEmpty());
		Assertions.assertTrue(customer.customerId > 0L);
	}
}
