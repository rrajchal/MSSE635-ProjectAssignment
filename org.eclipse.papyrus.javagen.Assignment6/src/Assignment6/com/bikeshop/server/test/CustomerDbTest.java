package Assignment6.com.bikeshop.server.test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Assignment6.com.bikeshop.client.*;
import Assignment6.com.bikeshop.server.*;

class CustomerDbTest {

	@Test
	void test() {
		CustomerDb customerDb = new CustomerDb();
		Customer customer = new Customer();
		Bike bike = new Bike();		
		customerDb.setBike(bike);
		customerDb.setCustomer(customer);
		
		System.out.println(customerDb);
		
		Assertions.assertTrue(customerDb.customer.equals(customer));
		Assertions.assertTrue(customerDb.bike.equals(bike));	
	}
}
